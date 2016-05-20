package com.douglas.Controller;

import com.douglas.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by douglas manzelmann on 4/20/2016.
 */

@Controller
public class HomeController {

    private PostService postService;

    @Autowired
    public HomeController(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping("/")
    public String home(Model model) {

//        send the current post back to the model
        model.addAttribute("post", postService.getLatestPost());
        return "index";
    }
}
