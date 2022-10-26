package com.nestdigital.twitterapp.dao;

import com.nestdigital.twitterapp.model.PostModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostDao extends CrudRepository<PostModel,Integer> {

    @Query(value = "SELECT p.`post`, p.`post_date`,u.name FROM `post`  p JOIN user u ON u.id=p.user_id",nativeQuery = true)
    List<String> ViewAllPosts();
    @Query(value= "SELECT `id`, `post`, `post_date`, `user_id` FROM `post` WHERE `user_id`=:user_id",nativeQuery = true)
    List<PostModel> ViewSingle(Integer user_id);

}
