package com.EventManeger.EventManeger.Repositories;

import com.EventManeger.EventManeger.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,Integer> {
}
