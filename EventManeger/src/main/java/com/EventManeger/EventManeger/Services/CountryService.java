package com.EventManeger.EventManeger.Services;

import com.EventManeger.EventManeger.Models.Country;
import com.EventManeger.EventManeger.Repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getCountries(){
        return countryRepository.findAll();
    }


    //save country

    public void  save(Country country){
        countryRepository.save(country);
    }



    // find by ID
    public Optional<Country> findById(int id){
        return    countryRepository.findById(id);
    }

    public void delete(Integer id) {
        countryRepository.deleteById(id);
    }
}
