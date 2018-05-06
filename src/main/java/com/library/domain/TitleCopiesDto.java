package com.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TitleCopiesDto {
    private Long titleCopyId;
    private Title title;
    private TitleStatus titleStatus;
}
