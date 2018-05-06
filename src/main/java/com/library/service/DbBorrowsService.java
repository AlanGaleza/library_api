package com.library.service;

import com.library.domain.Borrows;
import com.library.repository.BorrowsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbBorrowsService {
    @Autowired
    BorrowsRepository borrowsRepository;

    public Borrows getBorrowById(Long borrowId) { return borrowsRepository.findByBorrowId(borrowId).orElse(null); }

    public List<Borrows> getAllBorrows() { return borrowsRepository.findAll(); }

    public Borrows saveBorrow(Borrows borrow) { return borrowsRepository.save(borrow); }

    public void deleteBorrowById(Long borrowId) { borrowsRepository.deleteByBorrowId(borrowId); }
}

