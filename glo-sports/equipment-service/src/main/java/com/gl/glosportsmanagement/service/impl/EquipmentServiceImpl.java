package com.gl.glosportsmanagement.service.impl;

import com.gl.glosportsmanagement.entity.EquipmentDetails;
import com.gl.glosportsmanagement.exception.EquipmentNotFoundException;
import com.gl.glosportsmanagement.repo.EquipmentRepository;
import com.gl.glosportsmanagement.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipmentServiceImpl implements EquipmentService {

    @Autowired
    EquipmentRepository equipmentRepository;

    @Override
    public EquipmentDetails saveEquipment(EquipmentDetails user) {
        return equipmentRepository.save(user);
    }

    @Override
    public EquipmentDetails getEquipmentDetails(Long id) {
        return equipmentRepository.findById(id).orElseThrow(() -> new EquipmentNotFoundException(id));
    }
}
