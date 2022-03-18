package com.fms.service;

import com.fms.models.PersonalData;
import com.fms.repositories.PersonalDataRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class PersonalDataService {

    private final PersonalDataRepository personalDataRepository;

    public void createOrUpdatePersonalData(PersonalData personalData){
        personalDataRepository.save(personalData);
    }
}
