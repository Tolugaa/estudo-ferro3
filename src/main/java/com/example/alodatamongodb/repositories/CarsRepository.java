package com.example.alodatamongodb.repositories;

import com.example.alodatamongodb.entities.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarsRepository extends MongoRepository<Car,String> {
    public List<Car> findByMarcaIgnoreCase(String marca);
}