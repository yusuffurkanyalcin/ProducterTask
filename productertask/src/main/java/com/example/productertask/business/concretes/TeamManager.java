package com.example.productertask.business.concretes;

import com.example.productertask.business.abstracts.TeamService;
import com.example.productertask.dataAccess.TeamDAO;
import com.example.productertask.models.Team;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class TeamManager implements TeamService {

    private final TeamDAO teamDAO;

    @Override
    public Team getById(int id) {
        return teamDAO.findById(id).orElse(null);
    }

    @Override
    public boolean isTeamFull(int id) {
        if(isTeamExists(id)==true){
            Team team = teamDAO.findById(id).get();
            if(team.getPlayers().size()==(12)){
                return true;
            }
        }
        return false;
    }

    private boolean isTeamExists(int id){
        if(teamDAO.findById(id).isEmpty() == true){
            return false;
        }
        return true;
    }
}
