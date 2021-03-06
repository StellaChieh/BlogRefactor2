package com.example.controller;

import com.example.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts")
public class PostController {

    private static final Logger logger = LoggerFactory.getLogger(PostController.class);

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping("/list")
    String listPosts(Model model) {
        model.addAttribute("posts", postService.list());
        return "posts/list";
    }

    @RequestMapping("/view/{slug}")
    String view(@PathVariable(value = "slug") String slug,  Model model) {
        model.addAttribute("post", postService.getBySlug(slug));
        return "posts/view";
    }
}
