package com.fms.dtos;

import com.fms.models.FieldAction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ActionParamsDto {

    private Long id;

    private String Name;

    private String Value;

    private FieldAction fieldAction;
}
