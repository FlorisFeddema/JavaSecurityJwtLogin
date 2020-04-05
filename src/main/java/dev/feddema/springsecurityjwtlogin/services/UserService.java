package dev.feddema.springsecurityjwtlogin.services;

import dev.feddema.springsecurityjwtlogin.domain.User;
import dev.feddema.springsecurityjwtlogin.exceptions.UniqueValueExistsException;
import dev.feddema.springsecurityjwtlogin.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    private UserRepository repository;
    private PasswordEncoder encoder;

    @Autowired
    public UserService(UserRepository repository, PasswordEncoder encoder) {
        this.repository = repository;
        this.encoder = encoder;
    }

    @Override
    public void register(String username, String password) throws UniqueValueExistsException {
        var user = new User();
        user.setUsername(username);
        user.setPassword(encoder.encode(password));

        if (repository.existsByUsername(username)) throw new UniqueValueExistsException("User with the name " + username +  " already exists");

        repository.saveAndFlush(user);
    }
}

