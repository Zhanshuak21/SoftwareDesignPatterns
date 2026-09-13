package com.assignment.builder;

public interface ReportBuilder {
    ReportBuilder setTitle(String title);
    ReportBuilder setAuthor(String author);
    ReportBuilder addSection(String sectionHeading, String content);
    ReportBuilder setFooter(String footer);
    Report build();
}