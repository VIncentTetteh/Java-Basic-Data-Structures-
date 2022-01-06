package com.masterclass.HashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        HashMap<Integer,String[]> name = new HashMap<>();
        String[] arr = {"Vincent","Kwame", "Kofi"};
        name.put(1, arr);
        name.entrySet().stream().map(integerEntry -> integerEntry.getKey() + " -> " + Arrays.toString(integerEntry.getValue())).forEach(System.out::println);
    }
}
