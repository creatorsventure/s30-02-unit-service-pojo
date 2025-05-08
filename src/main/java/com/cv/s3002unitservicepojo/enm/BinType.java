package com.cv.s3002unitservicepojo.enm;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum BinType {
    SINGLE(1),
    RANGE(2);

    private final int code;

    BinType(int code) {
        this.code = code;
    }

    @JsonValue
    public int toValue() {
        return code;
    }


    @JsonCreator
    public static BinType fromCode(int code) {
        for (BinType type : BinType.values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid Bin type code: " + code);
    }
}
