package com.example.productertask.graphqlResolvers;

import com.example.productertask.business.abstracts.PlayerService;
import com.example.productertask.dto.responses.PlayerResponseDTO;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PlayerQueryResolver implements GraphQLQueryResolver {

    private final PlayerService playerService;

    public List<PlayerResponseDTO> getAllPlayers(){
        return playerService.getAll();
    }

}
