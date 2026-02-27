package SOLIDPrinciples;

class Report {
    public String generateReport() {
        return "Report Data";
    }
}

class ReportPrinter {
    public void print(String report) {
        System.out.println("Printing: " + report);
    }
}

public class SRPExample {
    public static void main(String[] args) {
        Report report = new Report();
        ReportPrinter printer = new ReportPrinter();

        printer.print(report.generateReport());
    }
}