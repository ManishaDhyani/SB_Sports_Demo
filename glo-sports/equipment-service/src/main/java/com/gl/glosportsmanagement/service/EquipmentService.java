package com.gl.glosportsmanagement.service;

import com.gl.glosportsmanagement.entity.EquipmentDetails;

public interface EquipmentService {

    EquipmentDetails saveEquipment(EquipmentDetails user);

    EquipmentDetails getEquipmentDetails(Long id);

}
