package com.cv.s3002unitservicepojo.dto;

import com.cv.s10coreservice.dto.generic.GenericDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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
public class DeviceDto extends GenericDto {


    @Serial
    private static final long serialVersionUID = 5834379111334314995L;


    @NotBlank(message = "{app.message.failure.blank}")
    @NotNull(message = "{app.message.failure.blank}")
    private String selectedMerchantId;

    @NotBlank(message = "{app.message.failure.blank}")
    @NotNull(message = "{app.message.failure.blank}")
    private String selectedUnitOptionsId;

    @NotBlank(message = "{app.message.failure.blank}")
    @NotNull(message = "{app.message.failure.blank}")
    private String selectedUnitKeyId;

    @NotEmpty(message = "{app.message.failure.empty}")
    private List<String> currencyList;

    @NotEmpty(message = "{app.message.failure.empty}")
    private List<String> schemeList;

    @NotEmpty(message = "{app.message.failure.empty}")
    private List<String> actionList;

    @NotEmpty(message = "{app.message.failure.empty}")
    private List<String> engineList;

}
