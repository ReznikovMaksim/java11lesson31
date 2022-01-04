package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> j1 = new ArrayList<>(List.of("horror","action","triller"));
        List<String> j2 = new ArrayList<>(List.of("action","triller"));
        List<String> j3 = new ArrayList<>(List.of("horror","drama"));

        List<Person> a1 = new ArrayList<>(
                List.of(new Person("Vasya","gendalf"),
                        new Person("Danil","Aragorn"),
                        new Person("Petya","Golum")));
        List<Person> a2 = new ArrayList<>(
                List.of(new Person("Anton","Iron man"),
                        new Person("Danil","Spider-man"),
                        new Person("Igor","dr. Strange")));
        List<Person> a3 = new ArrayList<>(
                List.of(new Person("Vasya","Dog"),
                        new Person("Danil","Cat"),
                        new Person("Sasha","Snake")));

        List<String> t1 = new ArrayList<>(List.of("01:20"));
        List<String> t2 = new ArrayList<>(List.of("00:40","00:53","00:12"));
        List<String> t3 = new ArrayList<>(List.of("02:30"));

        Person mm1 = new Person("Ivan","movieMaker");
        Person mm2 = new Person("Alexey","movieMaker");

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Lord of Rings",2001,"movie",mm1,j1,a1,t1,1000));
        movies.add(new Movie("Avengers",2001,"movie",mm2,j2,a2,t3,500));
        movies.add(new Movie("About animals",2018,"serial",mm1,j3,a3,t2,2000));
    }
}
