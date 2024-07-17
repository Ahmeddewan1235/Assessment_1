public class AssigmentOne {
    public static void main (String[] args)
    {
// Part 3: creating objects for both the classes we made.
        // 3 objects for GP
        GeneralPractitioner gp1 = new GeneralPractitioner (1, "Awais Malangi", "General Practitioner", "Airport West");
        GeneralPractitinore gp2 = new GeneralPractitioner (2, "Abdullah Ampol", "General Practitioner", "Kew Hospital");
        GeneralPractitinore gp3 = new GeneralPractitinore (3, "Jalal Raami", "General Practitinore", "Diamond Creek");

        // 2 objects for Specialists
        Specialist specialist1 = new Specialist (1, "Amirah David", "Heart Specialist", "Cardiologist");
        Specialist specialist2 = new Specialist (2, "Noori Iqbal", "Skin Specialist", "Dermatologist");

        //Print for GP in Main Class
        System.out.println ("Genral Practitioners are: ");
        gp1.printDetails();
        Sytem.out.println("__________");
        gp2.printDetails();
        Sytem.out.println("__________");
        gp3.printDetails();
        Sytem.out.println("__________");

        //Print for Specialists in Mian Class
        System.out.println ("Specialists are: ");
        specialist1.printDetails();
        Sytem.out.println("__________");
        specialist2.printDetails();
        Sytem.out.println("__________");
    }
}
