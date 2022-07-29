package com.example.practicespring.service;

import com.example.practicespring.model.City;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService implements ICityService {
    private static List<City> cities;
    @Override
    public List<City> findAll() {
         List<City> cities = new ArrayList<City>();

         cities.add(new City(1L, "Ha Noi", 41000));
         cities.add(new City(2L, "Ha Nam", 41000));
         cities.add(new City(3L, "Ha Bac", 41000));
         cities.add(new City(4L, "Sai Gon", 41000));
         cities.add(new City(5L, "SaPa", 41000));
         return cities;
    }
}
