
// Ryan Monnier 
// CSD 402
// Module 10
// 03-May-2025
// git: https://github.com/islys/csd-402

public class InternationalDivision extends Division {
    private String region;
    private String primaryLanguage;

    public InternationalDivision(String name, int acctNumber, String region, String primaryLanguage) {
        super(name, acctNumber);
        this.region = region;
        this.primaryLanguage = primaryLanguage;
    }

    @Override
    public void display() {
        System.out.println("=== International Division ===");
        System.out.println("Division Name: " + name);
        System.out.println("Account Number: " + acctNumber);
        System.out.println("Region: " + region);
        System.out.println("Primary Language: " + primaryLanguage);
        System.out.println();
    }
}
