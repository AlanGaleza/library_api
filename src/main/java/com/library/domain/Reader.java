package com.library.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Reader {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    @NotNull
    private Long peselId;

    @Column
    @NotNull
    private String firstname;

    @Column
    @NotNull
    private String surname;

    @Column
    @NotNull
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date joinedDate;
}
