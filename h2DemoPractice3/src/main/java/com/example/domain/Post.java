package com.example.domain;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

    @Id @GeneratedValue
    private Long id;

    private String title;

    @Column(columnDefinition = "Text")
    private String body;

    @Column(columnDefinition = "Text")
    private String teaser;

    private String slug;

    @CreatedDate @Temporal(TemporalType.TIMESTAMP)
    private Date postedOn;

    @ManyToOne
    private Author author;

    private Post() {}  //JPA needs a private no arg constructor

    // our public constructor makes sure a title is set when creating a new Post
    public Post(String title) {
        this.setTitle(title) ;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(Date posted_on) {
        this.postedOn = posted_on;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTeaser() {
        return teaser;
    }

    public void setTeaser(String teaser) {
        this.teaser = teaser;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", posts='" + body + '\'' +
                ", posted_on=" + postedOn +
                '}';
    }
}
