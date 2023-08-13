package com.cristianortega.escalabproject.service;

import com.cristianortega.escalabproject.persistence.repository.TrucksRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TrucksService {

    private TrucksRepository trucksRepository;

}
