package com.fms.models;

import java.time.LocalDate;

public class Task {
    private Long id;
    private String description;
    private PersonalData personalData;
    private Boolean isCompleted;
    private LocalDate createdAt;
}
