package com.douglas.Controller;

import com.douglas.service.PostService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by douglas manzelmann on 4/23/2016.
 */

@Controller
@RequestMapping("/posts")
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping("/list")
    public String listPosts(Model model) {
        model.addAttribute("posts", postService.list());

        return "post/list";
    }

    @RequestMapping("/view/{slug}")
    public String view(@PathVariable("slug") String slug, Model model) {
        model.addAttribute("post", postService.getBySlug(slug));

        return "post/view";
    }
}
