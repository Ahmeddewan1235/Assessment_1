
//Sub Class 1 = GP which is extended from HealthProfessional

public class GeneralPractitioner extends HealthProfessional {
    private String gpName; //only used in this subclass

    public GeneralPractitioner(){
        super();
        this.gpName = "Sunbury Clinic";
    }

    public GeneralPractitioner (int ID, String name, String specific, String gpName){
        super (ID, name, specific);
        this.gpName = gpName;
    }

    public void printDetails(){
        System.out.println("The Doctor details are: ");
        super.printDetails();
        System.out.println("General Practitioner Name: " + gpName);
    }
}
