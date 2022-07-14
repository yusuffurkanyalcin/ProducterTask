package com.example.productertask.dataAccess;

import com.example.productertask.dto.responses.PlayerResponseDTO;
import com.example.productertask.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlayerDAO extends JpaRepository<Player, Integer> {

    @Query("SELECT new com.example.productertask.dto.responses.PlayerResponseDTO(player.id,player.name,player.surname,player.position,team.teamName) FROM Player player INNER JOIN player.team team WHERE player.team.id=:teamId")
    List<PlayerResponseDTO> getAllByTeamId(int teamId);

    @Query("SELECT new com.example.productertask.dto.responses.PlayerResponseDTO(player.id,player.name,player.surname,player.position,team.teamName) FROM Player player INNER JOIN  player.team team")
    List<PlayerResponseDTO> getAll();
}
