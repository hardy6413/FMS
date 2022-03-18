package com.fms.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AddressDto {
    private Long id;

    private String city;

    private String street;

    private String postalCode;

    private String buildingNumber;
}
