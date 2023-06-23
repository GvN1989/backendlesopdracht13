package com.example.les12services.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class TeacherDto {
    public Long id;

    @NotBlank
    public String firstName;

    @Size(min = 3, max = 255)
    public String lastName;

    @Past
    public LocalDate dob;
}
