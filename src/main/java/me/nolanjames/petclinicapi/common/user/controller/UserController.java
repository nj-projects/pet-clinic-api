package me.nolanjames.petclinicapi.common.user.controller;

import lombok.RequiredArgsConstructor;
import me.nolanjames.petclinicapi.common.user.model.User;
import me.nolanjames.petclinicapi.common.user.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public void add(@RequestBody User user) {
        userService.add(user);
    }

}
