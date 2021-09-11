package com.bsuir;

import com.classes.Bouquet;
import com.classes.Cornflowers;
import com.classes.Daisies;

import java.util.HashMap;
import java.util.LinkedList;

public class Main {
public static void main(String m[]){
    Daisies daisies = new Daisies(2,5,"auto2","bmw");
    System.out.println(daisies);
    daisies.buy();
    daisies.deleteItem();
    System.out.println(daisies.hashCode());



    Daisies daisies1 = new Daisies(2,5,"auto3","bmw2");
    System.out.println(daisies1);
    daisies1.buy();
    daisies1.deleteItem();
    System.out.println(daisies1.hashCode());

    System.out.print("Сравнение через equals(): ");
    System.out.println(daisies.equals(daisies1));

    System.out.print("Сравнение hashCode(): ");
    System.out.println(daisies.hashCode()==daisies1.hashCode());

    Cornflowers cornflowers1 = new Cornflowers(166,88,"Синий",10);
    Cornflowers cornflowers = new Cornflowers(11,12,"Васильки1",5);
    System.out.println(cornflowers);
    cornflowers.buy();
    cornflowers.deleteItem();

    LinkedList<Bouquet> bouquet1 = new LinkedList<>();
    bouquet1.add(daisies);
    bouquet1.add(daisies1);
    bouquet1.add(cornflowers);

    for(int i = 0; i <bouquet1.size(); i++) {
        System.out.println(bouquet1.get(i));
    }

    HashMap<String,Bouquet> bouquetHashMap = new HashMap<>();
    bouquetHashMap.put("букет из васильков",cornflowers);
    bouquetHashMap.put("большой букет из васильков",cornflowers1);

    System.out.println("7777777");
    System.out.println(bouquetHashMap.get("большой букет из васильков"));

}
}

