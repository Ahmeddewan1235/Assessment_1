


public class Appointment {

    private String patientName;
    private int mobileNumber;
    private String timeSlot;
    private HealthProfessional doctor; //refers back to objects in HealthProfessional class


    public Appointment(){
        this.patientName = "Unkown";
        this.mobileNumber = 123456789;
        this.timeSlot = "12:12";
        this.doctor = new HealthProfessional ();
    }

    //intialize
    public Appointment (String patientName, int mobileNumber, String timeSlot, HealthProfessional doctor);
    {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = TimeSlot;
        this.doctor = dpctor;
    }

    public void printDetails(){
        System.out.println("Patient Name is: " + patientName);
        System.out.println("Contact Number: " + mobileNumber);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Doctor: " + );
        doctor.printDetails();
    }

}
