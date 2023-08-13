package com.cristianortega.escalabproject.service;

import com.cristianortega.escalabproject.persistence.repository.PackagesProductsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PackagesProductsService {

    private PackagesProductsRepository packagesProductsRepository;

}
