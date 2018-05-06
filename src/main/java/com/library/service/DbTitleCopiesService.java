package com.library.service;

import com.library.domain.TitleCopies;
import com.library.repository.TitleCopiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbTitleCopiesService {
    @Autowired
    private TitleCopiesRepository titleCopiesRepository;

    public TitleCopies getTitleCopyById(Long titleCopiesId) { return titleCopiesRepository.findByTitleCopyId(titleCopiesId).orElse(null); }

    public List<TitleCopies> getAllTitleCopies() { return titleCopiesRepository.findAll(); }

    public TitleCopies save(TitleCopies titleCopies) { return titleCopiesRepository.save(titleCopies); }

    public void deleteTitleCopiesById(Long titleCopiesId) { titleCopiesRepository.deleteByTitleCopyId(titleCopiesId); }
}

