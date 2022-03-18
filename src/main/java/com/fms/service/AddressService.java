package com.fms.service;

import com.fms.models.Address;
import com.fms.repositories.AddressRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class AddressService {

    private final AddressRepository addressRepository;

    public void createOrUpdateAddress(Address address){
        addressRepository.save(address);
    }
}
