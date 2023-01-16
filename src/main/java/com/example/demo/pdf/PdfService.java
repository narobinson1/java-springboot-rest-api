package com.example.demo.pdf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PdfService {
    private final PdfRepository pdfRepository;

    @Autowired
    public PdfService(PdfRepository pdfRepository) {
        this.pdfRepository = pdfRepository;
    }
    public List<Pdf> getPdfs() {
        return pdfRepository.findAll();
    }

    public void addNewPdf(Pdf pdf) {
        Optional<Pdf> pdfOptional = pdfRepository.findPdfByTitle(pdf.getTitle());
        if (pdfOptional.isPresent()) {
            throw new IllegalStateException("existing pdf");
        }
        pdfRepository.save(pdf);
    }
}

