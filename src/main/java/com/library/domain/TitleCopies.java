package com.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class TitleCopies {
    @Id
    @GeneratedValue
    private Long titleCopiesId;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "titleId")
    private Title title;

    @Column
    @Enumerated(EnumType.STRING)
    @NotNull
    private TitleStatus titleStatus;

    public TitleStatus setTitleStatus(final TitleStatus titleStatus) { return this.titleStatus = titleStatus; }
}
