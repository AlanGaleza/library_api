package com.library.controller;

import com.library.domain.TitleDto;
import com.library.mapper.LibraryMappers;
import com.library.service.DbTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/library")
public class TitleController {
    @Autowired
    private LibraryMappers libraryMappers;
    @Autowired
    private DbTitleService dbTitleService;

    @RequestMapping(method = RequestMethod.GET, value = "getTitles")
    public List<TitleDto> getTitles() {
        return libraryMappers.mapToTitleDtoList(dbTitleService.getAllTitles());
    }

    @RequestMapping(method = RequestMethod.GET, value = "getTitle")
    public TitleDto getTitle(@RequestParam Long titleId) throws RequestNotFoundException {
        return libraryMappers.mapToTitleDto(dbTitleService.getTitleById(titleId));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "delete")
    public void deleteTitle(@RequestParam Long titleId) throws RequestNotFoundException {
        dbTitleService.deleteTitleById(titleId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "createTitle", consumes = APPLICATION_JSON_VALUE)
    public void createTitle(@RequestBody TitleDto titleDto) {
        dbTitleService.saveTitle(libraryMappers.mapToTitle(titleDto));
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateTitle")
    public TitleDto updateTitle(@RequestBody TitleDto titleDto) {
        return libraryMappers.mapToTitleDto(dbTitleService.saveTitle(libraryMappers.mapToTitle(titleDto)));
    }
}
