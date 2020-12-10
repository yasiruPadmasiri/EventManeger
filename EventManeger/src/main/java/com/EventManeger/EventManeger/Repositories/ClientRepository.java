package com.EventManeger.EventManeger.Repositories;

import com.EventManeger.EventManeger.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class ClientRepository implements JpaRepository<Client, Integer> {
}
