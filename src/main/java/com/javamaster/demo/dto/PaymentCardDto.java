package com.javamaster.demo.dto;

import com.javamaster.demo.entity.type.CardType;
import com.javamaster.demo.entity.type.CurrencyType;
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

    private CardType cardType;

    private CurrencyType currencyType;

}
