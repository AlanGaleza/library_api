package com.library.service;

import com.library.controller.RequestNotFoundException;
import com.library.domain.TitleCopies;
import com.library.domain.TitleStatus;
import com.library.repository.TitleCopiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DbTitleCopiesService {
    @Autowired
    private TitleCopiesRepository titleCopiesRepository;

    public Optional<TitleCopies> getTitleCopyById(Long titleCopiesId) { return titleCopiesRepository.findByTitleCopyId(titleCopiesId); }

    public List<TitleCopies> getAllTitleCopies() { return titleCopiesRepository.findAll(); }

    public TitleCopies save(TitleCopies titleCopies) { return titleCopiesRepository.save(titleCopies); }

    public void deleteTitleCopiesById(Long titleCopiesId) { titleCopiesRepository.deleteByTitleCopyId(titleCopiesId); }

    //TODO
    public List<TitleCopies> getNumberOfAvailableTitleCopies(Long titleId, TitleStatus titleStatus) {
        return titleCopiesRepository.findByTitle_TitleIdAndTitleStatus(titleId, titleStatus);
    }
}

