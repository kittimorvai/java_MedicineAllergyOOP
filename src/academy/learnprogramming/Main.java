package academy.learnprogramming;

public class Main {

    private static Enquiry enquiry = new Enquiry();

    public static void main(String[] args) {
//        enquiry.printOut();
        //enquiry.addNewMedicine(Medicine.createNewMedicine("Algopyrin"));
        enquiry.addNewMedicine(Medicine.createNewMedicine("Nospa"));
        enquiry.addNewMedicine(Medicine.createNewMedicine("Algoflex"));
        enquiry.addNewMedicine(Medicine.createNewMedicine("Voltaren"));

        enquiry.addNewAgent("Voltaren", "ibuprofen");
        enquiry.addNewAgent("Voltaren", "diklofenak");
        enquiry.addNewAgent("Nospa", "drotaverin");
        enquiry.addNewAgent("Algoflex", "ibuprofen");
        enquiry.addNewAgent("Algoflex", "penicillin");
        enquiry.addNewAgent("Algoflex", "diklofenak");
        enquiry.printOut();


        enquiry.addPatient(Patient.createPatient("Patient1"));
        enquiry.addPatient(Patient.createPatient("Patient2"));
        enquiry.addPatient(Patient.createPatient("Patient3"));

        enquiry.addAllergy("Patient3", "Algoflex");
        System.out.println(enquiry.isDangerous("Patient3", "Voltaren"));

    }
}
