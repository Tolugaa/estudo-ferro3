package com.example.alodatamongodb.services;

import com.example.alodatamongodb.entities.Car;
import com.example.alodatamongodb.repositories.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarsRepository carsRepository;

    public List<Car> buscarTodosCarros(){
        return carsRepository.findAll();
    }

    public List<Car> buscarCarrosPorMarca(String marca){
        return carsRepository.findByMarcaIgnoreCase(marca);
    }
}
