 class Patient {
String patientid;
String name;
Patient(String name, String patientid){
    this.patientid= patientid;
    this.name=name;
}
 void displaydetails(){
    System.out.println("paitent id  "+patientid );
    System.out.println("name   "+name);

}
class Doctor{
   private String doctorid;
 private String name;
private String specialzation;
private Patient[] patients;
int patientscount;
Doctor(String doctorid,String name){
    
this.doctorid     = doctorid;
        this.name         = name;
        this.patients     = new Patient[10];
        this.patientscount = 0;
}


}

    
}
public class Hospital {
    public static void main(String[] args) {
        
    }

}
