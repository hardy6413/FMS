package com.fms.mappers;

import com.fms.dtos.TaskDto;
import com.fms.models.Task;

public interface TaskMapper {

    TaskDto taskToTaskDto(TaskDto taskDto);

    Task taskDtoToTask(TaskDto taskDto);
}
