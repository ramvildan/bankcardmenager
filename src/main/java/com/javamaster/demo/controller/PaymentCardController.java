package com.javamaster.demo.controller;

import com.javamaster.demo.dto.PaymentCardDto;
import com.javamaster.demo.service.PaymentCardService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Payment_Card")
@RestController
@RequestMapping("/payment_card")
@RequiredArgsConstructor
@Log4j2
public class PaymentCardController {

    private final PaymentCardService paymentCardService;

    @PostMapping("/create")
    public PaymentCardDto createPaymentCard(@PathVariable Integer userId,
                                            @RequestBody PaymentCardDto paymentCardDto) {
        log.info("createPaymentCard: userId = {}, PaymentCardDto = {}", userId, paymentCardDto);
        return paymentCardService.createPaymentCard(userId, paymentCardDto);
    }
}
