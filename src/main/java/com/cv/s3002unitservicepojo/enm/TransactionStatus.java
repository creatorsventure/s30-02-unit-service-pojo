package com.cv.s3002unitservicepojo.enm;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum TransactionStatus {
    INITIALIZED(0),
    LINK_SENT(1),
    PAGE_LOADED(2),
    TRANSACTION_PUSHED(3),
    TRANSACTION_COMPLETED(4),
    RECON_COMPLETED(5),
    SETTLEMENT_COMPLETED(6);

    private final int code;

    TransactionStatus(int code) {
        this.code = code;
    }

    @JsonValue
    public int toValue() {
        return code;
    }


    @JsonCreator
    public static TransactionStatus fromCode(int code) {
        for (TransactionStatus type : TransactionStatus.values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid Transaction Status code: " + code);
    }
}
