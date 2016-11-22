package com.example;

import com.example.domain.Post;
import com.example.repository.PostRepository;
import com.example.service.DataLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;

@EnableJpaRepositories
@SpringBootApplication

public class H2DemoPractice3Application {

	/*
	private static final Logger logger = LoggerFactory.getLogger(H2DemoPractice3Application.class);

	PostRepository postRepository;
	@Autowired
	public H2DemoPractice3Application(PostRepository postRepository) {
		this.postRepository = postRepository;
	}

	@Autowired
	DataLoader dataLoader;

	@PostConstruct // the method annotated is run after all other parts of this class is setup
	void seePost() {
		logger.info("seePost method called....");
		for (Post posts: postRepository.findAll() ) {
			logger.info(posts.toString());
		}
	}
	*/
	public static void main(String[] args) {
				SpringApplication.run(H2DemoPractice3Application.class, args);
	}
}


