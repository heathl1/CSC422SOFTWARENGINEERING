import java.util.ArrayList;

public class PetDatabase {
    protected ArrayList<Pet> petDatabase = new ArrayList<>(); // Arraylist object to hold the pet info

    public PetDatabase() {
        // no parameter constructor
    }
    public void menu() {
        // option menu - to be updated
        System.out.println("What would you like to do?");
        System.out.println("1) Add more pets");
        System.out.println("2) Exit the program");

    }
    public void addPet(Pet pet) {
        // add pet to the database
        petDatabase.add(pet);
    }


}
