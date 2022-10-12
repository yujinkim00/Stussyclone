package com.stussy.stussyclone20220930yujin.repository;


import com.stussy.stussyclone20220930yujin.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountRepository {

    public User findUserByEmail(String email)throws Exception;
    public int saveUser(User user) throws Exception;


}
