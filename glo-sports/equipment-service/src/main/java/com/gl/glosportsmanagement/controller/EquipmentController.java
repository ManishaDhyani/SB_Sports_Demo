package com.gl.glosportsmanagement.controller;

import com.gl.glosportsmanagement.entity.EquipmentDetails;
import com.gl.glosportsmanagement.service.EquipmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/equipments")
public class EquipmentController {
    @Autowired
    private EquipmentService equipmentService;

    @PostMapping
    public ResponseEntity<EquipmentDetails> saveEquipment(@Valid @RequestBody EquipmentDetails equipmentDetails) {
        return ResponseEntity.status(201).body(equipmentService.saveEquipment(equipmentDetails));
    }

    @GetMapping("/{id}")
    public ResponseEntity<EquipmentDetails> getEquipmentDetails(@PathVariable Long id) {
        return ResponseEntity.ok(equipmentService.getEquipmentDetails(id));
    }
    @GetMapping("/{id}/available")
    public ResponseEntity<Boolean> IsEquipmentAvailable(@PathVariable Long id) {
        return ResponseEntity.ok(equipmentService.getEquipmentDetails(id).isAvailability());
    }



}
