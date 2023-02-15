package com.javamaster.demo.converter;

import com.javamaster.demo.dto.PaymentCardDto;
import com.javamaster.demo.dto.UserDto;
import com.javamaster.demo.entity.PaymentCard;
import com.javamaster.demo.entity.User;
import org.springframework.stereotype.Component;

import static java.util.Objects.isNull;

@Component
public class PaymentCardConverter {

    public PaymentCardDto fromPaymentCardToPaymentCardDto(PaymentCard paymentCard) {
        if(isNull(paymentCard)) {
            return null;
        }
        return PaymentCardDto.builder()
                .cardNumber(paymentCard.getCardNumber())
                .cardType(paymentCard.getCardType())
                .currencyType(paymentCard.getCurrencyType())
                .build();
    }
}
