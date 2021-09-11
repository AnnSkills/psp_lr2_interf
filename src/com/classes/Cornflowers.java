package com.classes;
import com.interfaces.Delete;

import java.util.Objects;

public class Cornflowers extends Bouquet implements Delete{
    private int diameter;
    public Cornflowers(int id, int amount, String name,int diameter) {
        super(id, amount, name);
        this.diameter = diameter;
    }

    public Cornflowers() {
        super();
        this.diameter = 10;
    }

    @Override
    public String toString() {
        return "объект Cornflowers{" +
                super.toString()+
                "диаметр='" + diameter + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cornflowers)) return false;
        Cornflowers cornflowers = (Cornflowers) o;
        return Objects.equals(diameter, cornflowers.diameter);
    }
    @Override
    public int hashCode() {
        return Objects.hash(diameter);
    }


    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }


    @Override
   public void buy() {
        System.out.println("Совершена покупка василька");
    }

    @Override
    public void deleteItem() {
        System.out.println("Удаление васильков");
    }




}
