package org.example.Lection9;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;


public class Collections {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(3);
        numbersList.add(14);
        numbersList.add(15);
        numbersList.add(92);
        numbersList.add(6);

        ArrayList<String> listName = new ArrayList();
        listName.add("Anna");
        listName.add("Sergiivna");
        listName.add("Koroliova");

        HashSet<Integer> uniqueElements = new HashSet<>();
        uniqueElements.add(3);
        uniqueElements.add(14);
        uniqueElements.add(15);
        uniqueElements.add(3);

        HashMap<String, String> cityPhone = new HashMap<>();
        cityPhone.put("Харків", "057");
        cityPhone.put("Миколаїв", "0512");
        cityPhone.put("Чернівці", "0372");
        cityPhone.put("Київ", "044");

        System.out.println(numbersList);
        System.out.println(listName);
        System.out.println(uniqueElements);
        System.out.println(cityPhone);
    }
}
