package com.cristianortega.escalabproject.service;

import com.cristianortega.escalabproject.persistence.repository.DriversRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class DriversService {

    private DriversRepository driversRepository;

}
