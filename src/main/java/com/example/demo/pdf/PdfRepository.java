package com.example.demo.pdf;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PdfRepository
        extends JpaRepository<Pdf, Long> {
    @Query("SELECT p FROM Pdf p WHERE p.title = ?1")
    Optional<Pdf> findPdfByTitle(String title);
}
