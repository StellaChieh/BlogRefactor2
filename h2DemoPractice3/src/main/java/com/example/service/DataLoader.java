package com.example.service;

import com.example.domain.Author;
import com.example.domain.Post;
import com.example.repository.AuthorRepository;
import com.example.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

//can load data by .sql or programically


@Service
public class DataLoader {

    /*
    PostRepository postRepository;
    AuthorRepository authorRepository;

    @Autowired
    public DataLoader(PostRepository postRepository, AuthorRepository authorRepository) {
        this.postRepository = postRepository;
        this.authorRepository = authorRepository;
    }


    @PostConstruct
    private void dataLoad() {
        //create an authors
        Author dv = new Author("stella","lee");
        dv.setEmailAddress("stella@gamil.com");
        authorRepository.save(dv);

        //create a posts
        Post post = new Post("Love");
        post.setBody("<p>Love make you strong</p>");
        post.setTeaser("<p>aaaaaaaaaaaaaaaaaccccccccccccccccccc</p>");
        post.setPostedOn(new Date());
        post.setAuthor(dv);
        post.setSlug("lala");
        postRepository.save(post);
    }
    */
}

