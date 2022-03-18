package com.fms.mappers;

import com.fms.dtos.FieldActionDto;
import com.fms.models.FieldAction;

public interface FieldActionMapper {

    FieldActionDto fieldActionToFieldActionDto(FieldAction fieldAction);

    FieldAction fieldActionDtoToFieldAction(FieldActionDto fieldActionDto);
}
