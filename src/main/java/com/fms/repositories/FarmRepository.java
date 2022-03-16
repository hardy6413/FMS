package com.fms.repositories;

import com.fms.models.Farm;
import org.springframework.data.repository.CrudRepository;

public interface FarmRepository extends CrudRepository<Farm, Long> {
}