package com.gl.glosportsmanagement.repo;

import com.gl.glosportsmanagement.entity.BookingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<BookingDetails, Long> {
}
