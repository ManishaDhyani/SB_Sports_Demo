package com.gl.glosportsmanagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "userdetails")
@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @NotBlank(message = "First Name is mandatory")
    private String firstName;

    @NotBlank(message = "Last Name is mandatory")
    private String lastName;

    @Email(message = "Email ID should be valid")
    @NotBlank(message = "Email ID is mandatory")
    private String emailId;

    @Past(message = "Date of Birth should be in the past")
    private Date dob;
}
