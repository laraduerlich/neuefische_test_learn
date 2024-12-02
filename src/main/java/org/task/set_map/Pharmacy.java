package org.task.set_map;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    Map<String, Medication> medications = new HashMap<>();

    public int getCount(){
        return medications.size();
    }

    public void save(Medication medication){
        medications.put(medication.getName(), medication);
    }

    public Medication find(String medicationName){
        if (medications.containsKey(medicationName)){
            return medications.get(medicationName);
        }
        return null;
    }

    public void delete(String medicationName){
        medications.remove(medicationName);
    }

    public void printAll() {
        for (Medication medication : medications.values()) {
            System.out.println(medication);
        }
    }
}
