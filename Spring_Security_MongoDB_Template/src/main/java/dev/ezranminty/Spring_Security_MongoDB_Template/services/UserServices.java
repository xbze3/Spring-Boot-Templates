package dev.ezranminty.Spring_Security_MongoDB_Template.services;

import dev.ezranminty.Spring_Security_MongoDB_Template.models.Users;
import dev.ezranminty.Spring_Security_MongoDB_Template.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServices {

    private final UserRepository userRepo;

    public Optional<Users> getUserByUsername(String username) {
        return userRepo.findByUsername(username);
    }

    public List<Users> getAllUsers() {
        return userRepo.findAll();
    }

}
