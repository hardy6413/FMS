package com.fms.mappers;

import com.fms.dtos.FieldDto;
import com.fms.models.Field;

public interface FieldMapper {

    FieldDto fieldToFieldDto(Field field);

    Field fieldDtoToField(FieldDto fieldDto);
}
