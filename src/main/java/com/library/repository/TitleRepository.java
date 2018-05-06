package com.library.repository;

import com.library.domain.Title;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TitleRepository extends CrudRepository<Title, Long> {

    Optional<Title> findByTitleId(Long titleId);

    @Override
    List<Title> findAll();

    @Override
    Title save(Title title);

    void deleteByTitleId(Long titleId);
}
