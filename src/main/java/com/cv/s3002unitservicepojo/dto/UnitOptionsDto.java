package com.cv.s3002unitservicepojo.dto;

import com.cv.s10coreservice.dto.generic.GenericDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serial;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class UnitOptionsDto extends GenericDto {


    @Serial
    private static final long serialVersionUID = 4199576836010621376L;

    private boolean captcha = false;
    private boolean transactionOTP = false;
    private boolean loginOTP = false;
    private boolean tokenization = false;
    private boolean cvvSecurity = false;
    private boolean makerCheckerMode = false;
    private boolean masking = false;
}
