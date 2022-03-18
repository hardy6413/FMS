package com.fms.mappers;

import com.fms.dtos.AddressDto;
import com.fms.models.Address;

public interface AddressMapper {

    AddressDto addressToAddressDto(Address address);

    Address addressDtoToAddress(AddressDto addressDto);
}
