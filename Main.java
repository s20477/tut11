package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item("s87483", "xyz1"));
        items.add(new Item("s21438", "xyz2"));
        items.add(new Item("s64738", "xyz3"));
        items.add(new Item("s84375", "xyz4"));
        items.add(new Item("s09358", "xyz6"));
        items.add(new Item("s19358", "xyz7"));
        items.add(new Item("s29358", "xyz8"));
        items.add(new Item("s39328", "xyz9"));
        items.add(new Item("s49358", "xyz10"));
        items.add(new Item("s59358", "xyz11"));
        items.add(new Item("s69308", "xyz12"));
        items.add(new Item("s79358", "xyz13"));
        items.add(new Item("s89378", "xyz14"));
        items.add(new Item("s99358", "xyz15"));


        for (Item i : items) {
            i.show();
        }

        HashMap<String, String> itemsMap = new HashMap();
        for (Item i : items) {
            itemsMap.put(i.getID(), i.getName());
        }

        for (Map.Entry<String, String> entries : itemsMap.entrySet()) {
            System.out.println(entries.getKey());
            System.out.println(entries.getValue());
        }
        List<Item> items2 = items.subList(0, 4);

    }
}
