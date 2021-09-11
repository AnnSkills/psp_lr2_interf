package com.classes;

import java.util.Objects;

public abstract class Bouquet {
    private int id;
    private int flowersAmount;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bouquet)) return false;
        Bouquet bouquet = (Bouquet) o;
        return id == bouquet.id && flowersAmount == bouquet.flowersAmount && Objects.equals(name, bouquet.name);
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "id=" + id +
                ", flowersAmount=" + flowersAmount +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, flowersAmount, name);
    }

    abstract void buy();

    public Bouquet() {
        this.id = id;
        this.flowersAmount=1;
        this.name = "kl13";
    }

    public Bouquet(int id, int flowersAmount, String name) {
        this.id = id;
        this.flowersAmount = flowersAmount;
        this.name = name;
    }


    void printNameOfShop(){
        System.out.println("Магазин цветов");
    }

}
