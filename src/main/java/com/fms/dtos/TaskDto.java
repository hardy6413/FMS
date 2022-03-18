package com.fms.dtos;

import com.fms.models.PersonalData;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class TaskDto {

    private Long id;

    private String description;

    private PersonalData personalData;

    private Boolean isCompleted;

    private LocalDate createdAt;
}
