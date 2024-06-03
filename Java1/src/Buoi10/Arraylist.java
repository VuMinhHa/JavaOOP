package Buoi10;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(10);
        list.add(105);
        list.add(1);
        System.out.println(list);
        //Random
        //Sap xep tang dan
        Collections.sort(list);
        //Dao nguoc
        Collections.reverse(list);
        System.out.println(list);


    }
}
