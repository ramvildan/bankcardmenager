package com.javamaster.demo.dto;

import com.javamaster.demo.entity.type.CardType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Integer id;

    @NotBlank(message = "Name must be specified")
    private String name;

    @NotBlank(message = "Surname must be specified")
    private String surname;

    @NotBlank(message = "Patronymic must be specified")
    private String patronymic;

    @Email(message = "Wrong format")
    private String email;

    private PaymentCardDto paymentCardDto;

    private CardType status;
}
