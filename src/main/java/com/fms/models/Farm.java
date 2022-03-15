package com.fms.models;

import java.util.Set;

public class Farm {
    private Long id;
    private String farmName;
    private String farmToken;
    private String image;
    private Address address;
    private Set<Field> fields;
}
