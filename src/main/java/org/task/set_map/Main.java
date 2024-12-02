package org.task.set_map;

public class Main {
    public static void main(String[] args) {

        Pharmacy pharmacy = new Pharmacy();

        Medication med1 = new Medication("Aspirin", 9, true);
        Medication med2 = new Medication("Paracetamol", 4, true);
        Medication med3 = new Medication("Sodium", 3, false);
        Medication med4 = new Medication("Gold", 2, false);
        Medication med5 = new Medication("Sodium", 2, false);

        pharmacy.save(med1);
        pharmacy.save(med2);
        pharmacy.save(med3);
        pharmacy.save(med4);
        pharmacy.save(med5);

        System.out.println("Aktueller Bestand: " + pharmacy.getCount());
        System.out.println("Finde: " + pharmacy.find("Paracetamol"));
        pharmacy.delete("Sodium");
        System.out.println("Aktueller Bestand: " + pharmacy.getCount());

        System.out.println("-".repeat(40));
        System.out.println("Aktuell im Bestand: ");
        pharmacy.printAll();

    }
}
