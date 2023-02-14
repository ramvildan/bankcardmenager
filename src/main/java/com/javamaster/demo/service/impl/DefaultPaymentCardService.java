package com.javamaster.demo.service.impl;

import com.javamaster.demo.dto.PaymentCardDto;
import com.javamaster.demo.entity.PaymentCard;
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

    @Override
    public void createPaymentCard(Integer userId, @Valid PaymentCardDto paymentCardDto) {
        PaymentCard newPaymentCard = userRepository.findById(userId)
                .map(user -> PaymentCard.builder()
                        .cardNumber(paymentCardDto.getCardNumber())
                        .cardType()
                        .currencyType()
                        .build());
        paymentCardRepository.save(newPaymentCard);

    }

    @Override
    public PaymentCardDto getById(Integer id) {
        return null;
    }
}
