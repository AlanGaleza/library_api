package com.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Borrows {
    @Id
    @GeneratedValue
    private Long borrowId;

    @ManyToOne
    @JoinColumn(name = "peselId")
    private Reader reader;

    @ManyToOne
    @JoinColumn(name = "titleCopiesId")
    private TitleCopies titleCopies;

    @Column
    private LocalDateTime borrowDate;

    @Column
    LocalDateTime returnDate;
}
