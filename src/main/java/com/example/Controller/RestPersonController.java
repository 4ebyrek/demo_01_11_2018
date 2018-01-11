package com.example.Controller;



//import com.example.Service.CityDTO;
//import com.example.Service.CityService;

import com.example.entity.City;
import com.example.entity.CityDef;
import com.example.repo.CityDefRepo;
import com.example.repo.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
public class RestPersonController {

    @Autowired
    CityRepo сityRepo;

    @Autowired
    CityDefRepo cityDefRepo;

    @GetMapping("/find_all_cities")
    public Iterable getAllCities(){
        return сityRepo.findAll();
    }

    @GetMapping("/find_all_city_defs")
    public Iterable getAllCityDefs(){
        return cityDefRepo.findAll();
    }

    @PostMapping("/save_new_def")
    public City saveNewDef(@RequestBody CityDef cityDef)throws Exception{

        City city = new City();
        cityDefRepo.save(cityDef);

        city.setCityId(cityDef.getCityId());
        city.setCityDef(cityDef);

        return сityRepo.save(city);
    }


//
//    @Autowired
//    CityDefRepo cityDefRepo;
//
//    @Autowired
//    CityRepo cityRepo;
//
//    @GetMapping("/find_all_city_def")
//    public Iterable<City_def> getAllCitiesDef (){
//
//        long l1 =1;
//
//        City_def city_def = new City_def("Nazik_city",l1);
//        cityDefRepo.save(city_def);
//
//        City city = new City();
//        city.setCity_id(l1);
//        city.setDef(city_def);
//        cityRepo.save(city);
//
//        return cityDefRepo.findAll();
//    }
//
//    @GetMapping("/find_all_city")
//    public Iterable<City> getAllCities (){

//        long l = 5;
//        long l1 =1;
//
//        City city = new City(l1,"xxx",l);
//
//        City_def city_def = new City_def("Bazarbayev_city",city_id);
//
//        cityRepo.save(city_def);
//        return cityRepo.findAll();
//    }

//        @Autowired
//        City_ent_repository city_ent_repository;
//
//        @Autowired
//        City_def_ent_repository city_def_ent_repository;
//
//        @GetMapping("find_all_city_def")
//        public List<City_def_ent> getAllCitiesDef (){
//                return city_def_ent_repository.findAll();
//        }

//        @Autowired
//        CityService cityService;
//
//        @GetMapping("/find_all")
//        public List<City_ent> getAllCities (){
//            return city_ent_repository.findAll();
//        }
//
//        @GetMapping("/find_all_def")
//        public List<City_def_ent> getAllCitiesDef (){
//                return city_def_ent_repository.findAll();
//        }
//
//        @GetMapping("/find_all_DTO")
//        public List<CityDTO> getAllCitiesDTO (){
//                return cityService.find_all();
//        }

}
