package com.fms.service;

import com.fms.models.Farm;
import com.fms.repositories.FarmRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Slf4j
@AllArgsConstructor
public class FarmService {

    private final FarmRepository farmRepository;

    public Set<Farm> findAll(){
        Set<Farm> farms = new HashSet<>();
        farmRepository.findAll().forEach(farms::add);
        return farms;
    }
}
