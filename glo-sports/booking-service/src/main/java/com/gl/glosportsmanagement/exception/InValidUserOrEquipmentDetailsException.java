package com.gl.glosportsmanagement.exception;

public class InValidUserOrEquipmentDetailsException extends RuntimeException{
    public InValidUserOrEquipmentDetailsException(Long userId,Long equipmentId) {
        super("InValid User or Equipment Details provided. Please check User ID :  " +userId+ " or Equipment Id : " + equipmentId);
    }
}
