package Homework6;

import javax.swing.text.Document;

public class ReportService {
    
    private final Map<String, Report> reportMap {
        this.reports = reports;
    }
    
    
    public byte[] createReport(Document document, String reportType) {
      Report report = reports.get(reportType);
      if (report == null) {
        throw new NoSuchElementException("Незарегестрированный отчет с типом \"" +reportType + "\"");
      } 
        //throw new UnsupportedOperationException();  
        return report.createReport (document);
    }
    
}

interface Report {
    byte createReport(Document document);
}