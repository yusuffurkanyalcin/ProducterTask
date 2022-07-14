package com.example.productertask.business.abstracts;

import com.example.productertask.models.Team;

public interface TeamService {
    Team getById(int id);
    boolean isTeamFull(int id);
}
