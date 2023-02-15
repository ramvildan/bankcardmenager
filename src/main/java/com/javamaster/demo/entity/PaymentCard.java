package com.javamaster.demo.entity;

import com.javamaster.demo.entity.type.CardType;
import com.javamaster.demo.entity.type.CurrencyType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "card_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Card_number")
    private Integer cardNumber;

    @Column(name = "Currency_type")
    private CurrencyType currencyType;

    @Column(name = "Card_type")
    private CardType cardType;

    @ToString.Exclude
    @OneToOne
    private User user;
}
