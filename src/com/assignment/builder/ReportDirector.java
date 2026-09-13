package com.assignment.builder;

public class ReportDirector {

    public void constructAcademicReport(ReportBuilder builder, String title, String author) {
        builder.setTitle(title)
                .setAuthor(author)
                .addSection("Abstract", "Overview of the research topic and primary findings.")
                .addSection("Methodology", "Description of analytical methods and tools applied.")
                .addSection("Conclusion", "Summary of conclusions and future works.")
                .setFooter("Confidential - Academic Assessment Purpose Only");
    }

    public void constructSummaryReport(ReportBuilder builder, String title, String author) {
        builder.setTitle(title)
                .setAuthor(author)
                .addSection("Executive Summary", "Key performance metrics and outcomes.")
                .setFooter("Internal Company Distribution Only");
    }
}