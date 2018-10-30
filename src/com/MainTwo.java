package com;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Personn     {
    int age;

    public Personn(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{"+"age="+age+"}";
    }
}

class ComparePerson implements Comparator<Personn> {
    @Override
    public int compare(Personn o1, Personn o2) {
        return o1.getAge()-o2.getAge();
    }
}

public class MainTwo {
    public static void main(String[] args) {
        ComparePerson comparePerson=new ComparePerson();

        Set set = new TreeSet(new ComparePerson());
        set.add(new Personn(4));
        set.add(new Personn(2));
        set.add(new Personn(5));
        set.add(new Personn(1));
        set.add(new Personn(3));
        for (Object o : set) {
            System.out.println(o);

        }


    }
}
