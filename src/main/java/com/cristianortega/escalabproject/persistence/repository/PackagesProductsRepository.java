package com.cristianortega.escalabproject.persistence.repository;

import com.cristianortega.escalabproject.persistence.entity.PackagesProducts;
import org.springframework.data.repository.CrudRepository;

public interface PackagesProductsRepository extends CrudRepository<PackagesProducts, String> {
}
