package com.gl.glosportsmanagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "equipmentdetails")
@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EquipmentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long equipmentId;
    @NotBlank(message = "Equipment Name is mandatory")
    private String equipmentName;
    @NotBlank(message = "Equipment Type is mandatory")
    private String equipmentType;
    @NotNull(message = "Availability is mandatory")
    private boolean availability;
}
