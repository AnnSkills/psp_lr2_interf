package com.classes;

import com.interfaces.Delete;

import java.util.Objects;

public class Daisies extends Bouquet implements Delete {
    private String mark;

    @Override
    public String toString() {
        return "обьъект Daisies{" +
                super.toString()+
                "mark='" + mark + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark);
    }

    public Daisies(int id, int amount, String name, String mark) {
        super(id, amount, name);
        this.mark = mark;
    }

    public Daisies() {
        super();
        this.mark="kii77";
    }

    @Override
    public void buy() {
        System.out.println("Ромашка оформлена");
    }
    @Override
    public void deleteItem() {
        System.out.println("Удаление ромашки");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Daisies)) return false;
        Daisies daisies = (Daisies) o;
        return Objects.equals(mark, daisies.mark);
    }

}
