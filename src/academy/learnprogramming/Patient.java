package academy.learnprogramming;

import java.util.ArrayList;

public class Patient extends Medicine {
    private String patientName;
    private ArrayList <String> allergy;

    public Patient(String name){
        this.patientName = name;
        this.allergy = new ArrayList<>();
    }
    public ArrayList<String> getAllergy(){
        return this.allergy;
    }

    public String getAllergyName(int position){
        return allergy.get(position);
    }

    public void addAllergy (String agent){
        this.allergy.add(agent);
    }


    public String getPatientName() {
        return patientName;
    }
    public static Patient createPatient(String name){
        return new Patient(name);
    }
}
