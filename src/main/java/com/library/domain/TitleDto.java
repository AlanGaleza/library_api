package com.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TitleDto {
    private Long titleId;
    private String Title;
    private String Author;
    private LocalDateTime releaseDate;
}
