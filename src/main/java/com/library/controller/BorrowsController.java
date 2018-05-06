package com.library.controller;

import com.library.domain.BorrowsDto;
import com.library.mapper.LibraryMappers;
import com.library.service.DbBorrowsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(value = "*")
@RestController
@RequestMapping(value = "/v1/library")
public class BorrowsController {
    @Autowired
    private LibraryMappers libraryMappers;
    @Autowired
    private DbBorrowsService borrowsService;

    @RequestMapping(method = RequestMethod.GET, value = "getBorrows")
    public List<BorrowsDto> getBorrows() {
        return libraryMappers.mapToBorrowDtoList(borrowsService.getAllBorrows());
    }

    @RequestMapping(method = RequestMethod.GET, value = "getBorrow")
    public BorrowsDto getBorrow(@RequestParam Long borrowId) throws RequestNotFoundException{
        return libraryMappers.mapToBorrowDto(borrowsService.getBorrowById(borrowId));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteBorrow")
    public void deleteBorrow(@RequestParam Long borrowId) {
        borrowsService.deleteBorrowById(borrowId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "createBorrow", consumes = APPLICATION_JSON_VALUE)
    public void createBorrow(@RequestBody BorrowsDto borrowsDto) {
        borrowsService.saveBorrow(libraryMappers.mapToBorrow(borrowsDto));
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateBorrow")
    public BorrowsDto updateBorrow(@RequestBody BorrowsDto borrowsDto) {
        return libraryMappers.mapToBorrowDto(borrowsService.saveBorrow(libraryMappers.mapToBorrow(borrowsDto)));
    }
}
