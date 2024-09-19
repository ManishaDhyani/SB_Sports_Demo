package com.gl.glosportsmanagement.exception;

public class EquipmentNotFoundException extends RuntimeException {
    public EquipmentNotFoundException(Long id) {
        super("Equipment not found with ID: " + id);
    }
}