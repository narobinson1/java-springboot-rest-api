package com.example.demo.pdf;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "api/v1/pdf")
public class PdfController {

    private final PdfService pdfService;

    @GetMapping
    public List<Pdf> getPdfs() {
        return pdfService.getPdfs();
    }

    @PostMapping
    public void registerNewPdf(@RequestBody Pdf pdf) {
        pdfService.addNewPdf(pdf);
    }
}
