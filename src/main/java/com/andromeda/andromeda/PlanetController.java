package com.andromeda.andromeda;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PlanetController {
    // objek
    @GetMapping("/planet")
    Map<String, Object> getPlanet(){
        Map<String, Object> planet = new HashMap<>();
        planet.put("id", 1);
        planet.put("name", "Mercury");
        planet.put("diameter", 100.000);
        return planet;
    }

    //string
    @GetMapping("/planets")
    String[] getPlanets(){
        String[] planets = { "Mercury", "Venus", "Earth", "Mars"};
        return planets;
    }

    //arraylist
    @GetMapping("/planet-list")
    List<String> getPlanetList(){
        List<String> planetList = new ArrayList<>();
        planetList.add("Mercury");
        planetList.add("Venus");
        planetList.add("Earth");
        return planetList;
    }
}
