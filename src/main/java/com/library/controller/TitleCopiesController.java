package com.library.controller;

import com.library.domain.TitleCopies;
import com.library.domain.TitleCopiesDto;
import com.library.domain.TitleStatus;
import com.library.mapper.LibraryMappers;
import com.library.service.DbTitleCopiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(value = "*")
@RequestMapping(value = "/v1/library")
@RestController
public class TitleCopiesController {
    @Autowired
    private LibraryMappers libraryMappers;
    @Autowired
    private DbTitleCopiesService titleCopiesService;

    @RequestMapping(method = RequestMethod.GET, value = "getTitleCopies")
    public List<TitleCopiesDto> getTitleCopies() {
        return libraryMappers.mapToTitleCopieDtoList(titleCopiesService.getAllTitleCopies());
    }

    @RequestMapping(method = RequestMethod.GET, value = "getTitleCopy")
    public TitleCopiesDto getTitleCopy(@RequestParam Long id) throws RequestNotFoundException{
        return libraryMappers.mapToTilteCopieDto(titleCopiesService.getTitleCopyById(id));
    }

    @RequestMapping(method = RequestMethod.GET, value = "getNumberOfCopiesByStatusAndTitleId")
    public List<TitleCopiesDto> getTitleCopies (@RequestParam Long id, TitleStatus titleStatus) {
        return libraryMappers.mapToTitleCopieDtoList(titleCopiesService.getNumberOfAvailableTitleCopies(id, titleStatus));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteTitleCopy")
    public void deleteTitleCopy(@RequestParam Long id) {
        titleCopiesService.deleteTitleCopiesById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "createTitleCopy", consumes = APPLICATION_JSON_VALUE)
    public void createTitleCopy(@RequestBody TitleCopiesDto titleCopiesDto) {
        titleCopiesService.save(libraryMappers.mapToTitleCopies(titleCopiesDto));
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateTitleCopy")
    public TitleCopiesDto updateTitleCopy(@RequestBody TitleCopiesDto titleCopiesDto) {
        return libraryMappers.mapToTilteCopieDto(titleCopiesService.save(libraryMappers.mapToTitleCopies(titleCopiesDto)));
    }
}
