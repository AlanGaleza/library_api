package com.library.mapper;

import com.library.domain.Reader;
import com.library.domain.ReaderDto;
import com.library.domain.Title;
import com.library.domain.TitleDto;
import org.springframework.stereotype.Component;

@Component
public class LibraryMappers {

    public Reader mapToReader(final ReaderDto readerDto) {
        return new Reader(
                readerDto.getPeselId(),
                readerDto.getSerialNumber(),
                readerDto.getFirstname(),
                readerDto.getSurname(),
                readerDto.getJoinedDate());
    }

    public ReaderDto mapToReaderDto(final Reader reader) {
        return new ReaderDto(
                reader.getPeselId(),
                reader.getSerialNumber(),
                reader.getFirstname(),
                reader.getSurname(),
                reader.getJoinedDate());
    }

    public Title mapToTitle(final TitleDto titleDto) {
        return new Title(
                titleDto.getTitleId(),
                titleDto.getTitle(),
                titleDto.getAuthor(),
                titleDto.getReleaseDate());
    }

    public TitleDto mapToTitleDto(final Title title) {
        return new TitleDto(
                title.getTitleId(),
                title.getTitle(),
                title.getAuthor(),
                title.getReleaseDate());
    }
}
