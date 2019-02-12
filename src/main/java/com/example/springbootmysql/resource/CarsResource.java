package com.example.springbootmysql.resource;

import com.example.springbootmysql.model.Cars;
import com.example.springbootmysql.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "rest/cars")
public class CarsResource {

    @Autowired
    CarsRepository carsRepository;
    @GetMapping(value = "/all")
    public List<Cars> getAll() {
        return carsRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<Cars> persist(@RequestBody final Cars cars) {
        carsRepository.save(cars);
        return carsRepository.findAll();
    }
}
