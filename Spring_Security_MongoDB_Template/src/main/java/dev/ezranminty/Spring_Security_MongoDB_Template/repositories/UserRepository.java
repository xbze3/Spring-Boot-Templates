package dev.ezranminty.Spring_Security_MongoDB_Template.repositories;

import dev.ezranminty.Spring_Security_MongoDB_Template.models.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<Users, String> {

    Optional<Users> findByUsername(String username);

}
