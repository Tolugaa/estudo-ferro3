package com.example.alodatamongodb.restcontrollers;

import com.example.alodatamongodb.entities.Car;
import com.example.alodatamongodb.entities.Erro;
import com.example.alodatamongodb.repositories.CarsRepository;
import com.example.alodatamongodb.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value="apis")
public class CarsRestController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "get-all-cars")
    public ResponseEntity<Object> buscarTodosCarros(){
        List<Car> carList;
        carList=carService.buscarTodosCarros();
        if(carList.isEmpty())
            return ResponseEntity.badRequest().body(new Erro("Nenhum veiculo encontrado"));
        return ResponseEntity.ok(carList);
    }
    @GetMapping(value = "get-cars-brand/{marca}")
    public ResponseEntity<Object> buscarCarrosPelaMarca(@PathVariable(value = "marca") String marca){
        List<Car> carList;
        carList=carService.buscarCarrosPorMarca(marca);
        if(carList.isEmpty())
            return ResponseEntity.badRequest().body(new Erro("Nenhum veiculo encontrado"));
        return ResponseEntity.ok(carList);
    }
}
