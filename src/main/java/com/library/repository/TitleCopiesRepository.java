package com.library.repository;

import com.library.domain.TitleCopies;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TitleCopiesRepository extends CrudRepository<TitleCopies, Long> {

    Optional<TitleCopies> findByTitleCopyId(Long titleCopyId);

    @Override
    List<TitleCopies> findAll();

    @Override
    TitleCopies save(TitleCopies titleCopies);

    void deleteByTitleCopyId(Long titleCopiesId);
}
