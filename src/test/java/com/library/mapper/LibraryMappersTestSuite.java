package com.library.mapper;

import com.library.domain.Reader;
import com.library.domain.ReaderDto;
import com.library.domain.Title;
import com.library.domain.TitleDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)

public class LibraryMappersTestSuite {

    @InjectMocks
    LibraryMappers libraryMappers;

    @Test
    public void mapToReaderTest() {
        //Given
        ReaderDto readerDto = new ReaderDto(12L, 1L, "Test", "Test", LocalDateTime.now());
        //When
        Reader readerResult = libraryMappers.mapToReader(readerDto);
        //Then
        assertThat(12L).isEqualTo(readerResult.getPeselId());
    }

    @Test
    public void mapToReaderDtoTest() {
        //Given
        Reader reader = new Reader(12L, 1L, "Test", "Test",LocalDateTime.now());
        //When
        ReaderDto readerDto = libraryMappers.mapToReaderDto(reader);
        //Then
        assertThat(12L).isEqualTo(readerDto.getPeselId());
    }

    @Test
    public void mapToTitleTest() {
        //Given
        TitleDto titleDto = new TitleDto(1L, "Test", "Test", LocalDateTime.now());
        //When
        Title titleResult = libraryMappers.mapToTitle(titleDto);
        //Then
        assertThat(1L).isEqualTo(titleResult.getTitleId());
    }

    @Test
    public void mapToTitleDtoTest() {
        //Given
        Title title = new Title(1L, "Test", "Test", LocalDateTime.now());
        //When
        TitleDto titleDtoResult = libraryMappers.mapToTitleDto(title);
        //Then
        assertThat(1L).isEqualTo(titleDtoResult.getTitleId());
    }


}
