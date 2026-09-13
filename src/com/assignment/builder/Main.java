package com.assignment.builder;

public class Main {
    public static void main(String[] args) {
        ReportDirector director = new ReportDirector();

        ReportBuilder pdfBuilder = new PdfReportBuilder();
        director.constructAcademicReport(pdfBuilder, "Design Patterns in Java", "Zhanshuak");
        Report pdfReport = pdfBuilder.build();

        System.out.println("=== PDF REPORT ===");
        System.out.println(pdfReport);

        Report htmlReport = new HtmlReportBuilder()
                .setTitle("Monthly Progress")
                .setAuthor("Dev Team")
                .addSection("Status", "All tasks completed on schedule.")
                .setFooter("Generated automatically")
                .build();

        System.out.println("\n=== HTML REPORT ===");
        System.out.println(htmlReport);
    }
}
