package com.fms.dtos;

import com.fms.models.Address;
import com.fms.models.Field;
import com.fms.models.PersonalData;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class FarmDto {
    private Long id;

    private String farmName;

    private String farmToken;

    private String image;

    private Address address;

    private Set<Field> fields = new HashSet<>();

    private Set<PersonalData> workers = new HashSet<>();
}
