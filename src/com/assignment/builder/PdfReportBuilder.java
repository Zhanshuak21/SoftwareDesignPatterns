package com.assignment.builder;

import java.util.ArrayList;
import java.util.List;

public class PdfReportBuilder implements ReportBuilder {
    private String title;
    private String author;
    private final List<String> sections = new ArrayList<>();
    private String footer;

    @Override
    public PdfReportBuilder setTitle(String title) {
        this.title = "[PDF Header] " + title;
        return this;
    }

    @Override
    public PdfReportBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    @Override
    public PdfReportBuilder addSection(String sectionHeading, String content) {
        this.sections.add("PDF Paragraph -> " + sectionHeading.toUpperCase() + ": " + content);
        return this;
    }

    @Override
    public PdfReportBuilder setFooter(String footer) {
        this.footer = "[PDF Page Footer: " + footer + "]";
        return this;
    }

    @Override
    public Report build() {
        validateState();
        return new Report(title, author, sections, footer);
    }

    private void validateState() {
        if (title == null || title.isBlank()) {
            throw new IllegalStateException("PDF Report creation failed: Title must not be blank.");
        }
        if (author == null || author.isBlank()) {
            throw new IllegalStateException("PDF Report creation failed: Author must not be blank.");
        }
    }
}