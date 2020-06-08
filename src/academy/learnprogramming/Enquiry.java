package academy.learnprogramming;


import java.util.ArrayList;

public class Enquiry {
    private ArrayList<Medicine> medicineData;
    private ArrayList<Patient> patient;

    public Enquiry() {
        medicineData = new ArrayList<>();
        patient = new ArrayList<>();
    }
    public void printOut (){

        for (Medicine medicineDatum : medicineData) {
            System.out.println("\n" + medicineDatum.getMedicine());
            for (int j = 0; j < medicineDatum.getAgent().size(); j++) {
                System.out.println("\t" + medicineDatum.getAgentName(j));
            }
        }

        for (Patient value : patient) {
            System.out.println(value.getPatientName());
        }
    }
    private boolean check (String name){
        for (Medicine medicineDatum : medicineData) {
            if (medicineDatum.getMedicine().equals(name)) {
                return true;
            }
        }
        return false;
    }
    public void addNewMedicine(Medicine medicine){
            if(!check(medicine.getMedicine())){
                medicineData.add(medicine);
            }
    }
    private int findMedicine(String name){
        for(int i = 0; i < medicineData.size(); i++){
            if(medicineData.get(i).getMedicine().equals(name)){
                return i;
            }
        }
        return -1;
    }
    private int findPatient(String name){
        for(int i = 0; i < patient.size(); i++){
            if(patient.get(i).getPatientName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public void addNewAgent(String nameOfMedicine, String nameOfAgent){
            int position = findMedicine(nameOfMedicine);
            medicineData.get(position).addAgent(nameOfAgent);
    }
    public void addPatient (Patient patient){
        if(!check(patient.getPatientName())){
            this.patient.add(patient);
        }
    }
    public void addAllergy (String nameOfPatient, String nameOfMedicine){
        int patientPosition = findPatient(nameOfPatient);
        int medicinePosition = findMedicine(nameOfMedicine);
        for (int i = 0; i < medicineData.get(medicinePosition).getAgent().size(); i++ ){
            patient.get(patientPosition).addAllergy(medicineData.get(medicinePosition).getAgentName(i));
        }
    }
    public String isDangerous (String nameOfPatient, String nameOfMedicine){
        StringBuilder temp = new StringBuilder("\nYes, " + nameOfMedicine+ " is dangerous for "+ nameOfPatient +", it contains:\n");
        boolean flag = false;
        int patientPosition = findPatient(nameOfPatient);
        int medicinePosition = findMedicine(nameOfMedicine);
        for (int i = 0; i < medicineData.get(medicinePosition).getAgent().size(); i++){
            for(int j = 0; j < patient.get(patientPosition).getAllergy().size(); j++){
                if(patient.get(patientPosition).getAllergyName(j).equals(medicineData.get(medicinePosition).getAgentName(i))){
                    temp.append(patient.get(patientPosition).getAllergyName(j)).append("\n");
                    flag = true;
                }
            }

        }
        if(flag){
            return temp.toString();
        } else {
            return "No, " + nameOfMedicine + " is not dangerous for " + nameOfPatient;
        }
    }
    
}
