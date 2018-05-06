package com.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BorrowsDto {
    private Long borrowId;
    private Reader reader;
    private TitleCopies titleCopies;
    private LocalDateTime borrowDate;
    private LocalDateTime returnDate;
}
