
// Ryan Monnier 
// CSD 402
// Module 10
// 03-May-2025
// git: https://github.com/islys/csd-402

public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision globalOps1 = new InternationalDivision("Pacific Ops", 3010, "Australia", "English");
        InternationalDivision globalOps2 = new InternationalDivision("Central Europe Ops", 3011, "Austria", "German");

        DomesticDivision usOps1 = new DomesticDivision("Southwest Division", 4102, "Arizona");
        DomesticDivision usOps2 = new DomesticDivision("Midwest Division", 4103, "Illinois");

        globalOps1.display();
        globalOps2.display();
        usOps1.display();
        usOps2.display();
    }
}
