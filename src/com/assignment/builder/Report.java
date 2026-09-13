package com.assignment.builder;

import java.util.Collections;
import java.util.List;

public class Report {
    private final String title;
    private final String author;
    private final List<String> sections;
    private final String footer;

    Report(String title, String author, List<String> sections, String footer) {
        this.title = title;
        this.author = author;
        this.sections = Collections.unmodifiableList(sections);
        this.footer = footer;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public List<String> getSections() { return sections; }
    public String getFooter() { return footer; }

    @Override
    public String toString() {
        return "Report {" +
                "\n  Title: '" + title + '\'' +
                "\n  Author: '" + author + '\'' +
                "\n  Sections: " + sections +
                "\n  Footer: '" + footer + '\'' +
                "\n}";
    }
}