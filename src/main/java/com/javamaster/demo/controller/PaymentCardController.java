package com.javamaster.demo.controller;

import com.javamaster.demo.dto.PaymentCardDto;
import com.javamaster.demo.service.PaymentCardService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "Payment Card controller")
@RestController
@RequestMapping("/v1/payment_card")
@RequiredArgsConstructor
@Log4j2
public class PaymentCardController {

    private final PaymentCardService paymentCardService;

    @PostMapping("/v1/create")
    @ApiOperation("create Payment Card")
    public PaymentCardDto createPaymentCard(@PathVariable Integer userId,
                                            @RequestBody PaymentCardDto paymentCardDto) {
        log.info("createPaymentCard: userId = {}, PaymentCardDto = {}", userId, paymentCardDto);
        return paymentCardService.createPaymentCard(userId, paymentCardDto);
    }
}
