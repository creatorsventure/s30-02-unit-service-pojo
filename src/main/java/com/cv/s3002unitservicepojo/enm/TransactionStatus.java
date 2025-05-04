package com.cv.s3002unitservicepojo.enm;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum TransactionStatus {
    INITIALIZED(0),
    LINK_SENT(2),
    PAGE_LOADED(3),
    TRANSACTION_PUSHED(4),
    TRANSACTION_COMPLETED(5),
    RECON_COMPLETED(6),
    SETTLEMENT_COMPLETED(7);

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
