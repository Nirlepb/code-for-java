import java.util.*;

class Patient {
    int id;
    String name;
    String element;

    Patient(String name, int id, String element) {
        this.name = name;
        this.id = id;
        this.element = element;
    }

    public void displayPatientDetails() {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient ID: " + id);
        System.out.println("Disease: " + element);
        System.out.println();
    }
}

class Doctor {
    int docid;
    String name;
    String specialization;
    static int total_no_of_doctors = 0;
    List<Patient> pats;

    Doctor(int docid, String name, String specialization) {
        this.docid = docid;
        this.name = name;
        this.specialization = specialization;
        total_no_of_doctors++;
        this.pats = new ArrayList<>();
    }

    void addPatient(Patient p) {
        pats.add(p);
    }

    void displayDoctorDetails() {
        System.out.println("Doctor ID: " + docid);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Patients Associated:");

        for (Patient k : pats) {
            k.displayPatientDetails();
        }
    }
}

class Hospital {
    public static void main(String[] args) {

        Patient p1 = new Patient("Rehan", 1, "Hypermetropia");
        Patient p2 = new Patient("Arjun", 2, "Fever");

        Doctor d1 = new Doctor(101, "Nirlep", "Eye Specialist");
        Doctor d2 = new Doctor(102, "Nirlep Babu", "General Physician");

        d1.addPatient(p1);
        d2.addPatient(p2);

        d1.displayDoctorDetails();
        d2.displayDoctorDetails();

        System.out.println("Total Doctors: " + Doctor.total_no_of_doctors);
    }
}