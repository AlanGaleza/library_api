package com.library.repository;

import com.library.domain.Borrows;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BorrowsRepository extends CrudRepository<Borrows, Long> {

    Optional<Borrows> findByBorrowId(Long borrowId);

    @Override
    List<Borrows> findAll();

    @Override
    Borrows save(Borrows borrows);

    void deleteByBorrowId(Long borrowsId);
}
