package com.EventManeger.EventManeger.Services;

import com.EventManeger.EventManeger.Models.Country;
import com.EventManeger.EventManeger.Repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getCountries(){
        return countryRepository.findAll();
    }



}
