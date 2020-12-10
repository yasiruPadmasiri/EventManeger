package com.EventManeger.EventManeger.Repositories;

import com.EventManeger.EventManeger.Models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country,Integer> {

}
