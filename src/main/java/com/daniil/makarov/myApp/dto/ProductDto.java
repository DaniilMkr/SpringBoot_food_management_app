package com.daniil.makarov.myApp.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;


import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private Long id;
    @NotEmpty(message = "Name should not be empty!")
    private String name;
    @NotNull(message = "Expiration date should not be empty!")
    private LocalDate dateOfExpiration;
}
