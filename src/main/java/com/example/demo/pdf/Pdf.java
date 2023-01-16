package com.example.demo.pdf;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Pdf {
    @Id
    @SequenceGenerator(
            name = "pdf_sequence",
            sequenceName = "pdf_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
            generator = "pdf_sequence"
    )

    private int StorageID;
    private int ISBN;
    private String title;
    private String author;
    private LocalDate publishedDate;

    public Pdf(int storageID, int ISBN, String title, String author, LocalDate publishedDate) {
        this.StorageID = storageID;
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publishedDate = publishedDate;
    }

    public int getStorageID() {
        return StorageID;
    }

    public void setStorageID(int storageID) {
        StorageID = storageID;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }
}



