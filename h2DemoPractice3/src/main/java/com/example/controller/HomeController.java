package com.example.controller;

import com.example.domain.Post;
import com.example.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    private PostService postService;

    @Autowired
    public HomeController(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping("/")
    String home (Model model) {
        model.addAttribute("post", postService.getLastestPost() );
        /*
        model.addAttribute("title", postService.getLastestPost().getTitle());
        model.addAttribute("body", postService.getLastestPost().getBody());
        model.addAttribute("date", postService.getLastestPost().getPostedOn());
        model.addAttribute("author", postService.getLastestPost().getAuthor().getFirstName());
        model.addAttribute("authorEmailAddress",postService.getLastestPost().getAuthor().getEmailAddress());
        */
        return "index";
    }

}
