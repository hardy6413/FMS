package com.fms.dtos;

import com.fms.models.Farm;
import com.fms.models.FieldAction;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class FieldDto {
    private Long id;

    private Double area;

    private String name;

    private String description;

    private Boolean isProperty;

    private String BlockNumber;

    private Double extraPayment;

    private Farm farm;

    private String image;

    private Set<FieldAction> fieldActions = new HashSet<>();
}
