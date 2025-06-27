package dev.ezranminty.Spring_Security_MongoDB_Template.controllers;

import dev.ezranminty.Spring_Security_MongoDB_Template.models.Users;
import dev.ezranminty.Spring_Security_MongoDB_Template.services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final UserServices userServices;

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!!!";
    }

    @GetMapping("/username/{username}")
    public ResponseEntity<?> getByUsername(@PathVariable String username) {
        return userServices.getUserByUsername(username)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public ResponseEntity<List<Users>> getAllUsers() {
        List<Users> users = userServices.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/app/landing")
    public String landing() {
        return "This is the unprotected landing page";
    }

}
