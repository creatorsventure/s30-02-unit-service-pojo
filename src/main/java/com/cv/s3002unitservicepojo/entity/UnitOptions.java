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
    private boolean partial = false;

    @Column
    private boolean allowExcess = false;

    @OneToMany(mappedBy = "unitOptions")
    @ToString.Exclude
    private List<Device> deviceList;

}
