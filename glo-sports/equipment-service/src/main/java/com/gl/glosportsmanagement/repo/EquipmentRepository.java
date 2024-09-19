package com.gl.glosportsmanagement.repo;

import com.gl.glosportsmanagement.entity.EquipmentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentRepository extends JpaRepository<EquipmentDetails, Long> {
}
