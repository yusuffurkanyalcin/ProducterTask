package com.example.productertask.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerResponseDTO {

    private int id;
    private String name;
    private String surname;
    private String positionName;
    private String teamName;
}
