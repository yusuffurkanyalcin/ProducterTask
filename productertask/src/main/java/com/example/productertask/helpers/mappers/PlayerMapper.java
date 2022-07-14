package com.example.productertask.helpers.mappers;

import com.example.productertask.dto.requests.PlayerCreationRequestDTO;
import com.example.productertask.models.Player;
import com.example.productertask.models.Team;
import org.springframework.stereotype.Service;

@Service
public class PlayerMapper{
    public Player playerCreationRequestDTOtoPlayerEntity(PlayerCreationRequestDTO playerCreationRequestDTO){

        Player player = new Player();
        Team team = new Team();

        team.setId(playerCreationRequestDTO.getTeamId());

        player.setName(playerCreationRequestDTO.getName());
        player.setSurname(playerCreationRequestDTO.getSurname());
        player.setPosition(playerCreationRequestDTO.getPosition().toString());
        player.setTeam(team);

        return player;
    }
}
