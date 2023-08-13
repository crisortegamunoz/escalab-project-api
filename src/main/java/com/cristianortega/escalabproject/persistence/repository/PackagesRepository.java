package com.cristianortega.escalabproject.persistence.repository;


import com.cristianortega.escalabproject.persistence.entity.Packages;
import org.springframework.data.repository.CrudRepository;

public interface PackagesRepository extends CrudRepository<Packages, String> {
}
