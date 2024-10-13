package spring_boot_jekins_examples.spring_boot_jenkins.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring_boot_jekins_examples.spring_boot_jenkins.SpringBootJenkinsApplication;
import spring_boot_jekins_examples.spring_boot_jenkins.beans.User;

import java.util.List;

@RestController
public class UserController {

    final public static Logger UserController = LoggerFactory.getLogger(UserController.class);
    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {

        UserController.info("Getting the list of all users and sending it client.");

        return ResponseEntity.status(HttpStatus.OK)
                .body(List.of(new User(101L, "JavaTechie", "Admin"),
                        new User(102L, "Farhan", "Developer"),
                        new User(103L, "Ahzam", "Developer")));
    }
}
