package com.cristianortega.escalabproject.service;

import com.cristianortega.escalabproject.persistence.repository.PackagesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PackagesService {

    private PackagesRepository packagesRepository;
}
