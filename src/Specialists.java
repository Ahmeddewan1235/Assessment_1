

public class Specialists extends HealthProfessional {
    private String Field;

    public Specialists(){
        super();
        this.Field = "Liver Specialists";
    }

    public Specialists(int ID, String Specialization, String Field){
        super(ID, name, Specialization);
        this.field = field;
    }

    public void printDetails(){
        System.out.println("Specialist Doctor details: ");
        super.printDetails();
        System.out.println("Field of :" + Field);
    }
}

