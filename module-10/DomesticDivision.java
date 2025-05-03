
// Ryan Monnier 
// CSD 402
// Module 10
// 03-May-2025
// git: https://github.com/islys/csd-402

public class DomesticDivision extends Division {
    private String operatingState;

    public DomesticDivision(String name, int acctNumber, String operatingState) {
        super(name, acctNumber);
        this.operatingState = operatingState;
    }

    @Override
    public void display() {
        System.out.println("=== Domestic Division ===");
        System.out.println("Division Name: " + name);
        System.out.println("Account Number: " + acctNumber);
        System.out.println("Operating State: " + operatingState);
        System.out.println();
    }
}
