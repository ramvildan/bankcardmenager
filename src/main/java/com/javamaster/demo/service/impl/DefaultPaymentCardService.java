package com.javamaster.demo.service.impl;

import com.javamaster.demo.converter.PaymentCardConverter;
import com.javamaster.demo.dto.PaymentCardDto;
import com.javamaster.demo.entity.PaymentCard;
import com.javamaster.demo.entity.User;
import com.javamaster.demo.entity.type.CardType;
import com.javamaster.demo.repository.PaymentCardRepository;
import com.javamaster.demo.repository.UserRepository;
import com.javamaster.demo.service.PaymentCardService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultPaymentCardService implements PaymentCardService {

    private final UserRepository userRepository;

    private final PaymentCardRepository paymentCardRepository;

    private final PaymentCardConverter paymentCardConverter;

    @Override
    public PaymentCardDto createPaymentCard(Integer userId, @Valid PaymentCardDto paymentCardDto) {
        User userWithCard = userRepository.findUserById(userId);
        PaymentCard newPaymentCard = PaymentCard.builder()
                .user(userWithCard)
                .cardNumber(paymentCardDto.getCardNumber())
                .cardType(paymentCardDto.getCardType())
                .currencyType(paymentCardDto.getCurrencyType())
                .build();
        return paymentCardConverter.fromPaymentCardToPaymentCardDto(
                paymentCardRepository.save(newPaymentCard)
        );
    }
}
