package com.fms.mappers;

import com.fms.dtos.PersonalDataDto;
import com.fms.models.PersonalData;

public interface PersonalDataMapper {

    PersonalDataDto personalDataToPersonalDataDto(PersonalData personalData);

    PersonalData personalDataDtoToPersonalData(PersonalDataDto personalDataDto);
}
