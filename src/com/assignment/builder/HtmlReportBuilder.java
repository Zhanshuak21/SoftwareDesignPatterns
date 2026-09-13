package com.assignment.builder;

import java.util.ArrayList;
import java.util.List;

public class HtmlReportBuilder implements ReportBuilder {
    private String title;
    private String author;
    private final List<String> sections = new ArrayList<>();
    private String footer;

    @Override
    public HtmlReportBuilder setTitle(String title) {
        this.title = "<h1>" + title + "</h1>";
        return this;
    }

    @Override
    public HtmlReportBuilder setAuthor(String author) {
        this.author = "<meta name='author' content='" + author + "'>";
        return this;
    }

    @Override
    public HtmlReportBuilder addSection(String sectionHeading, String content) {
        this.sections.add("<section><h2>" + sectionHeading + "</h2><p>" + content + "</p></section>");
        return this;
    }

    @Override
    public HtmlReportBuilder setFooter(String footer) {
        this.footer = "<footer>" + footer + "</footer>";
        return this;
    }

    @Override
    public Report build() {
        validateState();
        return new Report(title, author, sections, footer);
    }

    private void validateState() {
        if (title == null || title.isBlank()) {
            throw new IllegalStateException("HTML Report creation failed: Title must not be blank.");
        }
        if (sections.isEmpty()) {
            throw new IllegalStateException("HTML Report creation failed: At least one section is required.");
        }
    }
}