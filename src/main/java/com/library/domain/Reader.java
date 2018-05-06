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
public class Reader {
    @Id
    private Long peselId;

    @Column
    @NotNull
    @GeneratedValue
    private Long serialNumber;

    @Column
    @NotNull
    private String firstname;

    @Column
    @NotNull
    private String surname;

    @Column
    @NotNull
    private LocalDateTime joinedDate;
}
