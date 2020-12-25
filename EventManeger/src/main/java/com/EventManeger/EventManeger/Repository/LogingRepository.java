package com.EventManeger.EventManeger.Repository;

import com.EventManeger.EventManeger.Model.LogingData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogingRepository  extends JpaRepository<LogingData, Integer> {

}
