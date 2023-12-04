package Homework6;

import java.util.Map;

public class CheckReporter {
    public static void main(String[] args) {
        new ReportService(Map.of(
            "pdf", new PdfReport()
        ));
        new ReportService(Map.of(
            "json", new JsonReport()
        ));
    }
}
