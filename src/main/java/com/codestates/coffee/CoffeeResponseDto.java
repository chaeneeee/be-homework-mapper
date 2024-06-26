package com.codestates.coffee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor

public class CoffeeResponseDto {
    private long coffeeId;
    private String korName;
    private String engName;
    private Integer price;
}
