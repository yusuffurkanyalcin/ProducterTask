package com.example.productertask.business.concretes;

import com.example.productertask.business.abstracts.TeamService;
import com.example.productertask.business.constants.messages.PlayerMessages;
import com.example.productertask.dataAccess.PlayerDAO;
import com.example.productertask.dto.requests.PlayerCreationRequestDTO;
import com.example.productertask.business.abstracts.PlayerService;
import com.example.productertask.dto.responses.PlayerResponseDTO;
import com.example.productertask.helpers.mappers.PlayerMapper;
import com.example.productertask.models.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PlayerManager implements PlayerService {
    private final PlayerDAO playerDAO;
    private final PlayerMapper playerMapper;

    private final TeamService teamService;
    @Override
    public Player create(PlayerCreationRequestDTO playerCreationRequestDTO) {
        if(teamService.isTeamFull(playerCreationRequestDTO.getTeamId())==true){
            return null;
        }
        Player player = playerMapper.playerCreationRequestDTOtoPlayerEntity(playerCreationRequestDTO);
        return playerDAO.save(player);
    }
    @Override
    public List<PlayerResponseDTO> getAll() {
        return playerDAO.getAll();
    }

    @Override
    public String deleteById(int id) {
        // We are able to check whether the entity exists by using AOP
        if(playerDAO.findById(id).isEmpty())
            return PlayerMessages.NO_PLAYER;
        playerDAO.deleteById(id);
        return PlayerMessages.DELETED_DONE;
    }


}
