public class Appointment {

    private String patientName;
    private int mobileNumber;
    private String timeSlot;
    private HealthProfessional doctor;


    public Appointment(){
        this.patientName = "Unkown";
        this.mobileNumber = 123456789;
        this.timeSlot = "12:12";
        this.doctor = new HealthProfessional ();
    }
}
