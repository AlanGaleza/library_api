package com.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ReaderDto {
    private Long peselId;
    private Long serialNumber;
    private String firstname;
    private String surname;
    private LocalDateTime joinedDate;
}
