package com.rizkykhapidsyah;

import java.util.*;

/*
 * @author Rizky Khapidsyah
 */
public class List_ {

    public static void main(String[] args) {

        List listA = new ArrayList();

        //memasukkan data
        listA.add("Elemen 1");
        listA.add("Elemen 2");
        listA.add("Elemen 3");

        // cara 1
        String element1 = (String) listA.get(0);
        String element2 = (String) listA.get(1);
        String element3 = (String) listA.get(2);

        System.out.println("======\nCara 1\n======");
        System.out.println(element1 + " " + element2 + " " + element3);

        // cara 2
        System.out.println("\n======\nCara 2\n======");
        Iterator iterator = listA.iterator();

        while (iterator.hasNext()) {
            String element = (String) iterator.next();
            System.out.println(element);
        }

        // hapus data pada index 0
        Boolean success = listA.remove("element 3");
        System.out.println("Hapus Data Element 3, Status = " + success);
        Object removed = listA.remove(0);
        System.out.println("Hapus Data Index 0, Data = " + removed);

    }
}
