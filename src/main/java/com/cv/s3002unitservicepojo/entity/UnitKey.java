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
public class UnitKey extends GenericUnitEntity {

    @Serial
    private static final long serialVersionUID = 4074762267809674292L;

    @Column(nullable = false)
    private String commonName;

    @Column(nullable = false)
    private String organization;

    @Column(nullable = false)
    private String organizationalUnit;

    @Column(nullable = false)
    private String locality;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private Integer validityYears;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String unitPrivateKeyPassword;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String unitCertificate;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String unitPrivateKey;

    @OneToMany(mappedBy = "unitKey")
    @ToString.Exclude
    private List<Device> deviceList;

}
