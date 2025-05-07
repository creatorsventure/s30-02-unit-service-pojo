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

    @ManyToOne
    @JoinColumn(name = "merchant_id", referencedColumnName = "id", nullable = false)
    @ToString.Exclude
    private Merchant merchant;

    @ManyToOne
    @JoinColumn(name = "unit_option_id", referencedColumnName = "id", nullable = false)
    @ToString.Exclude
    private UnitOptions unitOptions;

    @ManyToOne
    @JoinColumn(name = "unit_key_id", referencedColumnName = "id", nullable = false)
    @ToString.Exclude
    private UnitKey unitKey;

    @ElementCollection
    @CollectionTable(
            name = "device_currency_mapping",
            joinColumns = @JoinColumn(name = "device_id")
    )
    @Column(name = "currency_id")
    @ToString.Exclude
    private List<String> currencyList;

    @ElementCollection
    @CollectionTable(
            name = "device_scheme_mapping",
            joinColumns = @JoinColumn(name = "device_id")
    )
    @Column(name = "scheme_id")
    @ToString.Exclude
    private List<String> schemeList;

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

}
