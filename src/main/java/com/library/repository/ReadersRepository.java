package com.library.repository;

import com.library.domain.Reader;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ReadersRepository extends CrudRepository<Reader, Long> {

    @Override
    List<Reader> findAll();

    @Override
    Optional<Reader> findById(Long peselId);

    @Override
    void deleteById(Long peselId);

    @Override
    Reader save(Reader reader);

    Optional<Reader> findBySerialNumber(Long serialNumber);

    void deleteBySerialNumber(Long serialNumber);
}
