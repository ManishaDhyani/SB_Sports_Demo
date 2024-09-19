package com.gl.glosportsmanagement.service;

import com.gl.glosportsmanagement.entity.UserDetails;

import java.util.Optional;

public interface UserService {

    UserDetails saveUser(UserDetails user);

    UserDetails getUserDetails(Long id);

}
