package com.cv.s3002unitservicepojo.entity;

import com.cv.s10coreservice.entity.generic.GenericUnitEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@Entity
public class Role extends GenericUnitEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -898422367882946943L;


    @ManyToMany
    @JoinTable(name = "role_permission_mapping",
            joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "permission_id", referencedColumnName = "id", nullable = false)
    )
    @ToString.Exclude
    private List<Permission> permissionList;

    @ManyToMany
    @JoinTable(name = "role_menu_mapping",
            joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "menu_id", referencedColumnName = "id", nullable = false)
    )
    @ToString.Exclude
    private List<Menu> menuList;

    @OneToMany(mappedBy = "role")
    @ToString.Exclude
    private List<UserDetail> userDetailList;

}
