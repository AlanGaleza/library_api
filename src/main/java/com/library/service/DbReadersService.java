package com.library.service;

import com.library.domain.Reader;
import com.library.repository.ReadersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DbReadersService {
    @Autowired
    private ReadersRepository readersRepository;

    public List<Reader> getAllReaders() {
        return readersRepository.findAll();
    }

    public Reader saveReader(Reader reader) {
        return readersRepository.save(reader);
    }

    public Reader getReaderById(Long id){ return readersRepository.findById(id).orElse(null); }

    public Reader getReaderByPeselId(Long peselId) {
        return readersRepository.findByPeselId(peselId).orElse(null);
    }

    public void deleteReaderByPeselId(Long peselId) {
        readersRepository.deleteByPeselId(peselId);
    }
}
