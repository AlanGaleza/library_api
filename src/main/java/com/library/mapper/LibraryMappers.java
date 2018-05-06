package com.library.mapper;

import com.library.domain.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LibraryMappers {

    public Reader mapToReader(final ReaderDto readerDto) {
        return new Reader(
                readerDto.getId(),
                readerDto.getPeselId(),
                readerDto.getFirstname(),
                readerDto.getSurname(),
                readerDto.getJoinedDate());
    }

    public ReaderDto mapToReaderDto(final Reader reader) {
        return new ReaderDto(
                reader.getId(),
                reader.getPeselId(),
                reader.getFirstname(),
                reader.getSurname(),
                reader.getJoinedDate());
    }

    public List<ReaderDto> mapToReaderDtoList(List<Reader> readers) {
        return readers.stream()
                .map(reader -> new ReaderDto(reader.getId(), reader.getPeselId(), reader.getFirstname(), reader.getSurname(), reader.getJoinedDate()))
                .collect(Collectors.toList());
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

    public List<TitleDto> mapToTitleDtoList(List<Title> titles) {
        return titles.stream()
                .map(title -> new TitleDto(title.getTitleId(), title.getTitle(), title.getAuthor(), title.getReleaseDate()))
                .collect(Collectors.toList());
    }

    public TitleCopies mapToTitleCopies(TitleCopiesDto titleCopiesDto) {
        return new TitleCopies(
                titleCopiesDto.getTitleCopyId(),
                titleCopiesDto.getTitle(),
                titleCopiesDto.getTitleStatus());
    }

    public TitleCopiesDto mapToTilteCopieDto(TitleCopies titleCopies) {
        return new TitleCopiesDto(
                titleCopies.getTitleCopyId(),
                titleCopies.getTitle(),
                titleCopies.getTitleStatus());
    }

    public List<TitleCopiesDto> mapToTitleCopieDtoList(List<TitleCopies> titleCopiesList) {
        return titleCopiesList.stream()
                .map(titleCopy -> new TitleCopiesDto(titleCopy.getTitleCopyId(), titleCopy.getTitle(), titleCopy.getTitleStatus()))
                .collect(Collectors.toList());
    }

    public Borrows mapToBorrow(BorrowsDto borrowsDto) {
        return new Borrows(
                borrowsDto.getBorrowId(),
                borrowsDto.getReader(),
                borrowsDto.getTitleCopies(),
                borrowsDto.getBorrowDate(),
                borrowsDto.getReturnDate());
    }

    public BorrowsDto mapToBorrowDto(Borrows borrows) {
        return new BorrowsDto(
                borrows.getBorrowId(),
                borrows.getReader(),
                borrows.getTitleCopies(),
                borrows.getBorrowDate(),
                borrows.getReturnDate());
    }

    public List<BorrowsDto> mapToBorrowDtoList(List<Borrows> borrowsList) {
        return borrowsList.stream()
                .map(borrow -> new BorrowsDto(borrow.getBorrowId(), borrow.getReader(), borrow.getTitleCopies(), borrow.getBorrowDate(), borrow.getReturnDate()))
                .collect(Collectors.toList());
    }
}
