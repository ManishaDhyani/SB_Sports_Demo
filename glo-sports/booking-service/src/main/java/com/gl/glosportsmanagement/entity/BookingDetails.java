package com.gl.glosportsmanagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "bookingdetails")
@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookingDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;
    @NotNull(message = "User ID is mandatory")
    private Long userId;
    @NotNull(message = "Equipment ID is mandatory")
    private Long equipmentId;
    @NotNull(message = "Booking Date is mandatory")
    private Date bookingDate;
    @NotNull(message = "Return Date is mandatory")
    private Date returnDate;
}
