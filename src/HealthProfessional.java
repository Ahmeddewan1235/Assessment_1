
//Part 1
// main class

public class HealthProfessional {
    public int ID;
    public String name;
    public String specific;

    public HealthProfessional() {
        this.ID = 1;
        this.name = "John";
        this.specific = "GP";
    }

    public HealthProfessional (int ID, String name, String specific) {
        this.ID = ID;
        this.name = name;
        this.specific = specific;
    }
    // Print command with user-friendly sentence.
    public void printDetails(){
        System.out.println("ID# " + ID);
        System.out.println("Name: Dr, " + name);
        System.out.println("Specialization in: " + specific);
    }
}
