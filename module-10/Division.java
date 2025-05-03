
// Ryan Monnier 
// CSD 402
// Module 10
// 03-May-2025
// git: https://github.com/islys/csd-402

public abstract class Division {
    protected String name;
    protected int acctNumber;

    public Division(String name, int acctNumber) {
        this.name = name;
        this.acctNumber = acctNumber;
    }

    public abstract void display();
}

