package com.example.productertask.dataAccess;

import com.example.productertask.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamDAO extends JpaRepository<Team,Integer> {
}
