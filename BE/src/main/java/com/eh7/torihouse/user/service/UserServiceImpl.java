package com.eh7.torihouse.user.service;

import com.eh7.torihouse.user.mapper.UserMapper;
import com.eh7.torihouse.user.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public boolean join(User user) {
        Optional<User> search = userMapper.findByName(user.getUserName());
        if (search.isPresent()) return false;

        String rawPassword = user.getPassword();
        String encodedPassword = passwordEncoder.encode(rawPassword);
        user.setPassword(encodedPassword);

        int save = userMapper.save(user);
        return save > 0;
    }

    @Override
    public User getUser(String userName) {
        Optional<User> search = userMapper.findByName(userName);

        if (search.isEmpty()) throw new RuntimeException(userName);

        User user = search.get();
        user.setPassword(null);

        return user;
    }
}
