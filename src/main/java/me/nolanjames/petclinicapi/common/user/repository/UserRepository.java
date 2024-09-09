package me.nolanjames.petclinicapi.common.user.repository;

import me.nolanjames.petclinicapi.common.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
