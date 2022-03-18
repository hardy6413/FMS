package com.fms.dtos;

import com.fms.models.Address;
import com.fms.models.Field;
import com.fms.models.PersonalData;

import java.util.HashSet;
import java.util.Set;

public class FarmDto {
    private Long id;

    private String farmName;

    private String farmToken;

    private String image;

    private Address address;

    private Set<Field> fields = new HashSet<>();

    private Set<PersonalData> workers = new HashSet<>();
}
