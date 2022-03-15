package com.fms.models;

import java.time.LocalDate;
import java.util.Set;

public class FieldAction {
    private Long id;
    private Field field;
    private PersonalData personalData;
    private LocalDate actionStart;
    private String actionName;
    private String description;
    private Boolean isCompleted;
    private Set<ActionParams> actionParams;
}
