package com.javamaster.demo.repository;

import com.javamaster.demo.entity.PaymentCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentCardRepository extends JpaRepository<PaymentCard, Integer> {
}
