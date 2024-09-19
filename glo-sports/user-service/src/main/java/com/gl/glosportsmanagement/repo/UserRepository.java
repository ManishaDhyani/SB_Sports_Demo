package com.gl.glosportsmanagement.repo;

import com.gl.glosportsmanagement.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Long> {
}
