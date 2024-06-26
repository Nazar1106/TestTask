package com.example.java_practical_test_assignment.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonRootName("data")
public class UserPartialUpdateDTO {

    @Email(message = "Email should be valid")
    private String email;

    private String firstName;

    private String lastName;

    @Past(message = "Birth date should be in the past")
    private LocalDate birthDate;

    private String address;

    private String phoneNumber;
}
