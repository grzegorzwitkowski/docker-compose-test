package com.github.grzegorzwitkowski.dockercomposetest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(path = "/users")
public class UsersController {

    private final UsersRepository usersRepository;

    public UsersController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @RequestMapping(method = POST, consumes = APPLICATION_JSON_VALUE)
    public void saveUser(@RequestBody User user) {
        usersRepository.save(user);
    }

    @RequestMapping(path = "/{id}", method = GET, produces = APPLICATION_JSON_VALUE)
    public User findById(@PathVariable("id") int id) {
        User user = usersRepository.findOne(id);
        if (user != null) {
            return user;
        } else {
            throw new UserNotFoundException(id);
        }
    }

    @RequestMapping(method = GET, produces = APPLICATION_JSON_VALUE)
    public List<User> findAll() {
        return usersRepository.findAll();
    }
}
