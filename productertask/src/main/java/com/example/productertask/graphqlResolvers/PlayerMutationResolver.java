package com.example.productertask.graphqlResolvers;


import com.example.productertask.business.abstracts.PlayerService;
import com.example.productertask.dto.requests.PlayerCreationRequestDTO;
import com.example.productertask.models.Player;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
@Component
@RequiredArgsConstructor
public class PlayerMutationResolver implements GraphQLMutationResolver {

    private final PlayerService playerService;

    public Player create(PlayerCreationRequestDTO playerCreationRequestDTO){
        return playerService.create(playerCreationRequestDTO);
    }

    public String deletePlayerById(int id){
        return playerService.deleteById(id);
    }

}
