package com.gl.glosportsmanagement.config;

import com.gl.glosportsmanagement.model.UserDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service", url = "http://localhost:8080")
public interface UserClient {

    @GetMapping("/api/users/{id}")
    UserDetails getUserDetails(@PathVariable("id") Long id);
}