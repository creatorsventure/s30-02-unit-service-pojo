package com.cv.s3002unitservicepojo.entity;

import com.cv.s3002unitservicepojo.enm.TransactionStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@Entity
public class TransactionSummary implements Serializable {

    @Serial
    private static final long serialVersionUID = 3954145840453116335L;


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false)
    private String id;

    @Column(nullable = false)
    private String cardNumber;

    @Column(nullable = false)
    private String amount;

    @Column(nullable = false)
    private TransactionStatus status;

    @Column(nullable = false)
    private LocalDateTime dateTime;

    @Column(nullable = false)
    private String actionId;

    @Column
    private String subActionId;

    @Column(nullable = false)
    private String merchantId;

    @Column(nullable = false)
    private String deviceId;

    @Column(nullable = false)
    private String engineId;

    @Column(nullable = false)
    private String engineLinkId;

    @Column(nullable = false)
    private String historyLinkId;

}
