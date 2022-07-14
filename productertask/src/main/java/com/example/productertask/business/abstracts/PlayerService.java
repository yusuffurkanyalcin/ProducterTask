package com.example.productertask.business.abstracts;

import com.example.productertask.dto.requests.PlayerCreationRequestDTO;
import com.example.productertask.dto.responses.PlayerResponseDTO;
import com.example.productertask.models.Player;

import java.util.List;

public interface PlayerService {
    Player create(PlayerCreationRequestDTO playerCreationRequestDTO);
    String deleteById(int id);
    List<PlayerResponseDTO> getAll();

}
