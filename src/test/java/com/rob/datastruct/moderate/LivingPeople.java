package com.rob.datastruct.moderate;

import java.util.ArrayList;
import java.util.List;

public class LivingPeople {



    static class Person {
        int birth;
        int death;

        Person(int birth, int death) {
            this.birth = birth;
            this.death = death;
        }
    }

    public static int highestYear(List<Person> people) {

        int[] years = new int[2020];
         for (Person p: people) {

             //-- birth
            int delta = years[p.birth] + 1;
            years[p.birth] = delta;

            //-- death
            delta = years[p.death + 1];
            years[p.death + 1] = delta - 1;

        }


         int[] totals = new int[2020];
         int delta = 0;
         int maxTotal = 0;
         int maxYear = 0;
        for (int i = 0; i < years.length; i++) {
            int yearChange = years[i];
            if (yearChange != 0) {
                delta = delta + yearChange;
            }
            totals[i] = delta;
            System.out.println(i + " "+ totals[i]);

            if (totals[i] > maxTotal) {
                maxTotal = totals[i];
                maxYear = i;
            }

        }


        return maxYear;


    }


    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1978, 1990));
        persons.add(new Person(1977, 1990));
        persons.add(new Person(1979, 1990));
        persons.add(new Person(1978, 1981));
        persons.add(new Person(1979, 1990));
        persons.add(new Person(1990, 1992));
        persons.add(new Person(1979, 1990));



        System.out.println(highestYear(persons));


    }



}
