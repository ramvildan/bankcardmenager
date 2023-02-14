package com.javamaster.demo.service;

import com.javamaster.demo.dto.PaymentCardDto;
import jakarta.validation.Valid;

public interface PaymentCardService {

    void createPaymentCard(Integer userId, @Valid PaymentCardDto paymentCardDto);

    PaymentCardDto getById(Integer id);
}
