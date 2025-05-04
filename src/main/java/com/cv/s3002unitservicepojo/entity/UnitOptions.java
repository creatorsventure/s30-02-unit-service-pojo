package com.cv.s3002unitservicepojo.entity;

import com.cv.s10coreservice.entity.generic.GenericUnitEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@Entity
public class UnitOptions extends GenericUnitEntity {


    @Serial
    private static final long serialVersionUID = -8432449929466902191L;

    @Column
    private boolean captcha = false;

    @Column
    private boolean transactionOTP = false;

    @Column
    private boolean loginOTP = false;

    @Column
    private boolean tokenization = false;

    @Column
    private boolean cvvSecurity = false;

    @Column
    private boolean makerCheckerMode = false;

    @Column
    private boolean masking = false;

    @OneToMany
    @ToString.Exclude
    private List<Merchant> merchantList;

}
