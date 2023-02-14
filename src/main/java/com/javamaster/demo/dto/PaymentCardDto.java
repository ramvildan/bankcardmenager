package com.javamaster.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.CreditCardNumber;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentCardDto {

    private Integer id;

    @CreditCardNumber(message = "Wrong format")
    private Integer cardNumber;

}
