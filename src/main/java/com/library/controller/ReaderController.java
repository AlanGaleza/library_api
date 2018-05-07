package com.library.controller;

import com.library.domain.ReaderDto;
import com.library.mapper.LibraryMappers;
import com.library.service.DbReadersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin("*")
@RestController
@RequestMapping("/v1/library")
public class ReaderController {
    @Autowired
    private LibraryMappers libraryMappers;
    @Autowired
    private DbReadersService readersService;

    @RequestMapping(method = RequestMethod.GET, value = "getReaders")
    public List<ReaderDto> getReaders() {
        return libraryMappers.mapToReaderDtoList(readersService.getAllReaders());
    }

    @RequestMapping(method = RequestMethod.GET, value = "getReaderByPesel")
    public ReaderDto getReaderByPesel(@RequestParam Long readerPeselId) throws RequestNotFoundException {
        return libraryMappers.mapToReaderDto(readersService.getReaderByPeselId(readerPeselId));
    }

    @RequestMapping(method = RequestMethod.GET, value = "getReader")
    public ReaderDto getReader(@RequestParam Long id) throws RequestNotFoundException {
        return libraryMappers.mapToReaderDto(readersService.getReaderById(id));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteReaderByPesel")
    public void deleteReaderByPesel(@RequestParam Long readerPeselId) {
        readersService.deleteReaderByPeselId(readerPeselId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteReader")
    public void deleteReader(@RequestParam Long readerId) {
        readersService.deleteReaderById(readerId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "createReader", consumes = APPLICATION_JSON_VALUE)
    public void createReader(@RequestBody ReaderDto readerDto) {
        readersService.saveReader(libraryMappers.mapToReader(readerDto));
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateReader")
    public ReaderDto updateReader(@RequestBody ReaderDto readerDto) {
        return libraryMappers.mapToReaderDto(readersService.saveReader(libraryMappers.mapToReader(readerDto)));
    }
}
