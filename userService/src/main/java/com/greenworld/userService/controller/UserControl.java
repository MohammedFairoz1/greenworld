package com.greenworld.userService.controller;

import com.greenworld.userService.entities.User;
import com.greenworld.userService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserControl {

    @Autowired
   private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User user1 = userService.saveUser(user);
        return  ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }
    @GetMapping
    public ResponseEntity<List<User>> getAllUser() {
        List<User> getAll = userService.getAllUser();
        return ResponseEntity.ok(getAll);
    }
    @GetMapping("/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable String userId){
       User user = userService.getUser(userId);
       return ResponseEntity.ok(user);
    }
}
