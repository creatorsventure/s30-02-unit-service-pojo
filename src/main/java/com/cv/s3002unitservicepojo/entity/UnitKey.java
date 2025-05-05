package com.cv.s3002unitservicepojo.entity;

import com.cv.s10coreservice.entity.generic.GenericUnitEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
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
public class UnitKey extends GenericUnitEntity {

    @Serial
    private static final long serialVersionUID = 4074762267809674292L;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String password;

    @Column(nullable = false, columnDefinition = "TEXT")
    String privateKey;

    @Column(nullable = false, columnDefinition = "TEXT")
    String publicKey;

    @ManyToMany(mappedBy = "unitKeyList")
    @ToString.Exclude
    private List<Device> deviceList;

}
