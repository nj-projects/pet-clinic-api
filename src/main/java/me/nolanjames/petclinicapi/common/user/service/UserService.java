package me.nolanjames.petclinicapi.common.user.service;

import lombok.RequiredArgsConstructor;
import me.nolanjames.petclinicapi.common.user.model.User;
import me.nolanjames.petclinicapi.common.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void add(User user) {
        userRepository.save(user);
    }
}
