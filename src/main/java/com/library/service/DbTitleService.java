package com.library.service;

import com.library.domain.Title;
import com.library.repository.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DbTitleService {
    @Autowired
    private TitleRepository titleRepository;

    public List<Title> getAllTitles() { return titleRepository.findAll(); }

    public Title saveTitle(Title title) {return titleRepository.save(title); }

    public Title getTitleById(Long titleId) { return titleRepository.findByTitleId(titleId).orElse(null); }

    public void deleteTitleById(Long titleId) { titleRepository.deleteByTitleId(titleId); }
}
