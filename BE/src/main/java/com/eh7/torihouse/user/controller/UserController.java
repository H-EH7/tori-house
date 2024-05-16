package com.eh7.torihouse.user.controller;

import com.eh7.torihouse.user.model.User;
import com.eh7.torihouse.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/join")
    public boolean join(@RequestBody User user) {
        return userService.join(user);
    }

    @GetMapping("/get")
    public User getUser(@RequestParam(name = "name") String userName) {
        return userService.getUser(userName);
    }
}
