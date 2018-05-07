package com.library.repository;

import com.library.domain.Reader;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ReadersRepository extends CrudRepository<Reader, Long> {

    @Override
    List<Reader> findAll();

    @Override
    Optional<Reader>findById(Long id);

    Optional<Reader> findByPeselId(Long peselId);

    void deleteByPeselId(Long peselId);

    @Override
    Reader save(Reader reader);

    @Override
    void deleteById(Long id);
}
