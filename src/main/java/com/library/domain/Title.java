package com.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Title {
    @Id
    @GeneratedValue
    private Long titleId;

    @Column
    @NotNull
    private String Title;

    @Column
    @NotNull
    private String Author;

    @Column
    @NotNull
    private LocalDateTime releaseDate;
}
