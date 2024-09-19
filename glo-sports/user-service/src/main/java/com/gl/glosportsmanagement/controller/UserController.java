package com.gl.glosportsmanagement.controller;

import com.gl.glosportsmanagement.entity.UserDetails;
import com.gl.glosportsmanagement.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserDetails> saveUser(@Valid @RequestBody UserDetails userDetails) {
        return ResponseEntity.status(201).body(userService.saveUser(userDetails));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDetails> getUserDetails(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserDetails(id));
    }
}
