package com.fms.dtos;

import com.fms.models.PersonalData;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class TaskDto {

    private Long id;

    private String description;

    private PersonalData personalData;

    private Boolean isCompleted;

    private LocalDate createdAt;
}
