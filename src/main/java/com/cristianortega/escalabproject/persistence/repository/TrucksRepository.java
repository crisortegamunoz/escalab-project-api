package com.cristianortega.escalabproject.persistence.repository;


import com.cristianortega.escalabproject.persistence.entity.Trucks;
import org.springframework.data.repository.CrudRepository;

public interface TrucksRepository extends CrudRepository<Trucks, String> {
}
