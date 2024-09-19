package com.gl.glosportsmanagement.service.impl;

import com.gl.glosportsmanagement.entity.UserDetails;
import com.gl.glosportsmanagement.exception.UserNotFoundException;
import com.gl.glosportsmanagement.repo.UserRepository;
import com.gl.glosportsmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails saveUser(UserDetails user) {
        return userRepository.save(user);
    }

    @Override
    public UserDetails getUserDetails(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
    }
}
