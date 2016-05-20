drop table if EXISTS author;

create table author (
  id bigint not null,
  first_name VARCHAR(100),
  last_name VARCHAR(100),
  email VARCHAR(100),
  primary key (id)
);

drop table if EXISTS post;

create table post (
  id bigint not null,
  title VARCHAR(100),
  slug VARCHAR(100),
  teaser varchar(4000),
  posted_on TIMESTAMP,
  author_id bigint,
  PRIMARY key (id)
);