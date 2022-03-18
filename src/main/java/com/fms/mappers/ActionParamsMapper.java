package com.fms.mappers;

import com.fms.dtos.ActionParamsDto;
import com.fms.models.ActionParams;

public interface ActionParamsMapper {

    ActionParamsDto actionParamsToActionParamsDto(ActionParams actionParams);

    ActionParams actionParamsDtoToActionParams(ActionParamsDto actionParamsDto);
}
