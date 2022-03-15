package com.fms.models;

import java.util.Set;

public class PersonalData {
    private Long id;
    private String firstName;
    private String lastName;
    private Boolean isOwner;
    private Address address;
    private Farm farm;
    private Set<FieldAction> fieldActions;
    private Set<Task> tasks;
}
