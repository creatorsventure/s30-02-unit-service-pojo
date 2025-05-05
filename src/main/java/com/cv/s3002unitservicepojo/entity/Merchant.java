package com.cv.s3002unitservicepojo.entity;

import com.cv.s10coreservice.entity.generic.GenericUnitEntity;
import jakarta.persistence.*;
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
public class Merchant extends GenericUnitEntity {

    @Serial
    private static final long serialVersionUID = 4074762267809674292L;

    @Column(nullable = false)
    String legalName;

    @Column(nullable = false)
    String url;

    @Column(nullable = false)
    String merchantCategoryId;

    @ManyToOne
    @JoinColumn(name = "unit_option_id", referencedColumnName = "id", nullable = false)
    @ToString.Exclude
    private UnitOptions unitOptions;

    @OneToMany(mappedBy = "merchant")
    @ToString.Exclude
    private List<Device> deviceList;

}
