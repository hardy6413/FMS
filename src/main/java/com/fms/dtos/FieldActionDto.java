package com.fms.dtos;

import com.fms.models.ActionParams;
import com.fms.models.Field;
import com.fms.models.PersonalData;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class FieldActionDto {
    private Long id;

    private Field field;

    private PersonalData personalData;

    private LocalDate actionStart;

    private String actionName;

    private String description;

    private Boolean isCompleted;

    private Set<ActionParams> actionParams = new HashSet<>();
}
