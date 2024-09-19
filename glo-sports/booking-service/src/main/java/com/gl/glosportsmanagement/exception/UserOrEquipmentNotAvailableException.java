package com.gl.glosportsmanagement.exception;

public class UserOrEquipmentNotAvailableException extends RuntimeException {
    public UserOrEquipmentNotAvailableException(Long userId, Long equipmentId) {
        super("User or Equipment not available with userId: " + userId + " and Equipment Id: "+ equipmentId);
    }
}