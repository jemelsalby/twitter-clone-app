package com.nestdigital.twitterapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="post")
public class PostModel {

    @Id
    @GeneratedValue
    private int id;
    private int userId;
    private String postDate;
    private String post;

    public PostModel(int id, int userId, String postDate, String post) {
        this.id = id;
        this.userId = userId;
        this.postDate = postDate;
        this.post = post;
    }

    public PostModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
