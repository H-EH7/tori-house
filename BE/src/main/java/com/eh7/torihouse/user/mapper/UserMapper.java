package com.eh7.torihouse.user.mapper;

import com.eh7.torihouse.user.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface UserMapper {
    Optional<User> findByName(String userName);
    int save(User user);
}
