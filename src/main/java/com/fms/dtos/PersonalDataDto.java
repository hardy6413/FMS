package com.fms.dtos;

import com.fms.models.Address;
import com.fms.models.Farm;
import com.fms.models.FieldAction;
import com.fms.models.Task;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
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
