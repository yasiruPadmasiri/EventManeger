package com.EventManeger.EventManeger.Repositories;

import com.EventManeger.EventManeger.Models.Loging;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogingRepository extends JpaRepository<Loging,String> {

}
