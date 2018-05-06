package com.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ReaderDto {
    private Long id;
    private Long peselId;
    private String firstname;
    private String surname;
    private Date joinedDate;
}
