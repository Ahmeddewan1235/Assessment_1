
import java.until.ArrayList;

public class AssigmentOne {
    private static ArrayList<Appointment> appointment = new ArrayList<>();

    public static void main (String[] args)
    {
// Part 3: creating objects for both the classes we made.
        // 3 objects for GP
        GeneralPractitioner gp1 = new GeneralPractitioner (1, "Awais Malangi", "General Practitioner", "Airport West");
        GeneralPractitioner gp2 = new GeneralPractitioner (2, "Abdullah Ampol", "General Practitioner", "Kew Hospital");
        GeneralPractitioner gp3 = new GeneralPractitioner (3, "Jalal Raami", "General Practitinore", "Diamond Creek");

        // 2 objects for Specialists
        Specialist specialist1 = new Specialist (1, "Amirah David", "Heart Specialist", "Cardiologist");
        Specialist specialist2 = new Specialist (2, "Noori Iqbal", "Skin Specialist", "Dermatologist");

        //Print for GP in Main Class
        System.out.println ("Genral Practitioners are: ");
        gp1.printDetails();
        System.out.println("__________");
        gp2.printDetails();
        System.out.println("__________");
        gp3.printDetails();
        System.out.println("__________");

        //Print for Specialists in Mian Class
        System.out.println ("Specialists are: ");
        specialist1.printDetails();
        System.out.println("__________");
        specialist2.printDetails();
        System.out.println("__________");

//Part 5- appoinments
        CreateAppointment("Alice joe", 1234567890, "12:22", new GeneralPractitioner(1, "Awais Malangi", "General Practitioner", "Airport West"));
        CreateAppointment("Sean De", 121212456, "08:00", new Specialist(2, "Noori Iqbal", "Skin Specialist", "Dermatologist"));

        System.out.println("Existing appoinments;");
        PrintExistingAppointments();
        System.out.println("__________");

        CancelBooking(1234567890);

        System.out.println("Upfate appoinments: ");
        PrintExistingAppointments();
        System.out.println("__________");
    }

    public static void CreateAppointment(String patientName, int mobileNumber, String timeSlot, HealthProfessional doctor){
        if (patientName == null || mobileNumber == null || timeSlot == null || doctor == null){
            System.out.println("Error 404, All Details must be provided");
            return;
        }
        Appointment appointment = new Appointment(patientName, mobileNumber, timeSlot, doctor);
        appointment.add(appointment);
    }
//creating appointments
    public static void PrintExistingAppointments(ArrayList<Appointment> appointment){
        if (appointment.isEmpty()){
        System.out.println("No Appointments");
        return;
        }
        for (Appointment appointment : appointments){
            appointment.printDetails();
            System.out.println("__________");
        }
    }
//cancel by mobile Number
public static void CancelBooking (int mobileNumber){
        Appointment appointmentToRemove = null;
        for (Appointment appointment : appointment){
            if (appointment,getMobileNumber().equals(mobileNumber)){
                appointmentToRemove = appointment;
                break;
            }
        }
        if (appointmentToRemove != null){
            appointment.remove(appointmentToRemove);
            System.out.println("Appointment for Mobile Number" + mobileNumber + "is now removed");
        } else {
            System.out.println ("No appointment exist for this Mobile Number" + mobileNumber);
        }
    }
}
