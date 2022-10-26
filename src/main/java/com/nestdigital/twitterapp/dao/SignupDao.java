package com.nestdigital.twitterapp.dao;

import com.nestdigital.twitterapp.model.SignupModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SignupDao extends CrudRepository<SignupModel,Integer> {

    @Query(value="SELECT `id`, `address`, `email`, `l_name`, `mobile`, `name`, `pass`, `user_name` FROM `user` WHERE `user_name`=:user_name AND`pass`=:pass",nativeQuery = true)
    List<SignupModel> Signup(String user_name, String pass );
}
