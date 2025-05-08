package com.cv.s3002unitservicepojo.entity;

import com.cv.s10coreservice.entity.generic.GenericUnitEntity;
import com.cv.s3002unitservicepojo.enm.BinType;
import com.cv.s3002unitservicepojo.enm.InstrumentType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serial;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@Entity
public class Bin extends GenericUnitEntity {


    @Serial
    private static final long serialVersionUID = -4786740292329119634L;

    @Column(nullable = false)
    String schemeId;

    @Column(nullable = false)
    BinType type;

    @Column(nullable = false)
    InstrumentType instrumentType;

    @Column(nullable = false)
    Long start;

    @Column(nullable = false)
    Long end;


}
