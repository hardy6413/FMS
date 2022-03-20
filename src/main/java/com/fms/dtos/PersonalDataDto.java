package com.fms.dtos;

import com.fms.models.Address;
import com.fms.models.Farm;
import com.fms.models.FieldAction;
import com.fms.models.Task;

import java.util.HashSet;
import java.util.Set;

public class PersonalDataDto {
    private Long id;

    private String firstName;

    private String lastName;

    private Boolean isOwner;

    private Address address;

    private Farm farm;

    private Set<FieldAction> fieldActions = new HashSet<>();

    private Set<Task> tasks = new HashSet<>();
}
