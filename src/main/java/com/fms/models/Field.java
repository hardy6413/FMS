package com.fms.models;

import java.util.Set;

public class Field {
    private Long id;
    private Double area;
    private String name;
    private String description;
    private Boolean isProperty;
    private String BlockNumber;
    private Double extraPayment;
    private Farm farm;
    private String image;
    private Set<FieldAction> fieldActions;
}
