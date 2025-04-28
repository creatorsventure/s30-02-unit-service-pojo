package com.cv.s3002unitservicepojo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class SideNaveDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1806996469151483187L;

    private String title;
    private String path;
    private String icon;
    private String iconType;
    private String iconTheme;

    @JsonProperty("submenu")
    private List<SideNaveDto> subMenuList;

}
