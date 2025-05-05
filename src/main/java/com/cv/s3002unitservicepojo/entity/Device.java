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
public class Device extends GenericUnitEntity {

    @Serial
    private static final long serialVersionUID = 4074762267809674292L;

    @Column(nullable = false)
    private String schemeId;

    @Column(nullable = false)
    String currencyId;

    @ManyToOne
    @JoinColumn(name = "merchant_id", referencedColumnName = "id", nullable = false)
    @ToString.Exclude
    private Merchant merchant;

    @ElementCollection
    @CollectionTable(
            name = "device_action_mapping",
            joinColumns = @JoinColumn(name = "device_id")
    )
    @Column(name = "action_id")
    @ToString.Exclude
    private List<String> actionList;

    @ElementCollection
    @CollectionTable(
            name = "device_engine_mapping",
            joinColumns = @JoinColumn(name = "device_id")
    )
    @Column(name = "engine_id")
    @ToString.Exclude
    private List<String> engineList;

    @ManyToMany
    @JoinTable(name = "unitkey_device_mapping",
            joinColumns = @JoinColumn(name = "device_id", referencedColumnName = "id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "unitkey_id", referencedColumnName = "id", nullable = false)
    )
    @ToString.Exclude
    private List<UnitKey> unitKeyList;

}
