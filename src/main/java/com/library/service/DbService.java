package com.library.service;

import com.library.domain.Reader;
import com.library.domain.Title;
import com.library.repository.ReadersRepository;
import com.library.repository.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DbService {
    @Autowired
    private ReadersRepository readersRepository;
    @Autowired
    private TitleRepository titleRepository;

    public List<Reader> getAllReaders() {
        return readersRepository.findAll();
    }

    public Reader saveReader(Reader reader) {
        return readersRepository.save(reader);
    }

    public Optional<Reader> getReaderByPeselId(Long peselId) {
        return readersRepository.findById(peselId);
    }

    public Optional<Reader> getReaderBySerialNumber(Long serialNumber) { return readersRepository.findBySerialNumber(serialNumber); }

    public void deleteReaderByPeselId(Long peselId) {
        readersRepository.deleteById(peselId);
    }

    public void deleteReaderBySerialNumber(Long serialNumber) {
        readersRepository.deleteBySerialNumber(serialNumber);
    }

    public List<Title> getAllTitles() { return titleRepository.findAll(); }

    public Title saveTitle(Title title) {return titleRepository.save(title); }

    public Optional<Title> getTitleById(Long titleId) { return titleRepository.findById(titleId); }

    public void deleteTitleById(Long titleId) { titleRepository.deleteById(titleId); }
}
