package com.eh7.torihouse.user.service;

import com.eh7.torihouse.user.model.User;

public interface UserService {

    boolean join(User user);

    User getUser(String userName);
}
