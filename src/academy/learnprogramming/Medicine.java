package academy.learnprogramming;

import java.util.ArrayList;

public class Medicine extends Enquiry {
    private String medicine;
    private ArrayList<String> agent;


    public Medicine() {
    }

    public Medicine(String medicine) {
        this.medicine = medicine;
        this.agent = new ArrayList<>();
    }

    public Medicine(String medicine, String agent) {
        this.medicine = medicine;
        this.agent.add(agent);
    }
    public void addAgent (String agent){
        this.agent.add(agent);
    }

    public String getMedicine() {
        return medicine;
    }
    public String getAgentName (int position) {
        return this.agent.get(position);
    }

    public ArrayList<String> getAgent() {
        return agent;
    }

    public static Medicine createNewMedicine (String name){
        return new Medicine(name);
    }
}
