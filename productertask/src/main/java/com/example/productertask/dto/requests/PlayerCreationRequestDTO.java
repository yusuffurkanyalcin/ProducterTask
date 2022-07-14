package com.example.productertask.dto.requests;

import com.example.productertask.enums.PlayerPosition;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerCreationRequestDTO {

    private String name;
    private String surname;
    private int teamId;
    private PlayerPosition position;
}
