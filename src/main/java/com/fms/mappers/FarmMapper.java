package com.fms.mappers;

import com.fms.dtos.FarmDto;
import com.fms.models.Farm;

public interface FarmMapper {

    FarmDto farmToFarmDto(Farm farm);

    Farm farmDtoToFarm(FarmDto farmDto);
}
