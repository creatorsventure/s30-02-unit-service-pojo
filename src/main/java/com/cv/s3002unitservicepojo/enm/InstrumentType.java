package com.cv.s3002unitservicepojo.enm;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum InstrumentType {
    CREDIT(1),
    DEBIT(2);

    private final int code;

    InstrumentType(int code) {
        this.code = code;
    }

    @JsonValue
    public int toValue() {
        return code;
    }


    @JsonCreator
    public static InstrumentType fromCode(int code) {
        for (InstrumentType type : InstrumentType.values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid Instrument type code: " + code);
    }
}
