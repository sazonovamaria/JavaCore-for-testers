package hw4;

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        ArrayList<String> phonesForLastName = phoneBook.getOrDefault(lastName, new ArrayList<>());
        phonesForLastName.add(phoneNumber);
        phoneBook.put(lastName, phonesForLastName);
    }
public ArrayList<String> get(String lastName){
        return phoneBook.get(lastName);
}

    public static void main(String[] args) {
        Phonebook phoneBook = new Phonebook();
        phoneBook.add("Sidorov", "89654567865");
        phoneBook.add("Malikov", "89864345654");
        phoneBook.add("Malikov", "89676543459");
        phoneBook.add("Popov", "89543456789");
        phoneBook.add("Ivanov", "89987654323");
        phoneBook.add("Kozlov", "89765436789");
        phoneBook.add("Menshov", "89876543456");
        System.out.println(phoneBook.get("Malikov"));
    }
}
