package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

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
        movies.add(new Movie("About animals",2019,"serial",mm1,j3,a3,t2,2000));

//        final var year = 2018;
//        final var flitered = new ArrayList<Movie>();
//        for (var movie : movies){
//            if(movie.getYear() == year){
//                flitered.add(movie);
//            }
//        }
//        for(var m : flitered){
//            System.out.println(m);
//        }

//        var movies2018 = movies.stream()
//                .filter(m -> m.getYear() == 2018)
//                .collect(Collectors.toList());
//        movies.stream()
//                .filter(m -> {
//                    System.out.println(m);
//                    return m.getYear() == 2018;}
//                ).count();
        //movies2018.forEach(System.out::println);
//        var movieNames = movies.stream()
//                .map(m -> m.getName())
//                .collect(Collectors.toList());
//        var numbers = List.of(1,2,3,4,5).stream()
//                        .map(num -> num * num)
//                        .collect(Collectors.toList());
//        var total = movies.stream()
//                        .mapToDouble(m -> m.getBudget())
//                                .sum();
//        System.out.println(total);
//        var filtered = movies.stream()
//                .filter(m -> m.getYear() == 2001)
//                .collect(Collectors.toList());
//        var numers = List.of(1,2,2,3,4,5,6,6,7).stream()
//                .filter(i -> i % 2 == 0)
//                .distinct()
//                .collect(Collectors.toList());
        //numers.forEach(System.out::println);
//        var list = movies.stream()
//                .map(Movie::getActors)
//                .collect(Collectors.toList());
//        var newList = movies.stream()
//                        .flatMap(m -> m.getActors().stream())
//                        .collect(Collectors.toList());
//        var sorted = movies.stream()
//                .sorted(Comparator.comparingDouble(Movie::getBudget))
//                        .collect(Collectors.toList());
//        var filtered = movies.stream()
//                        .skip(2)
//                        .limit(1)
//                        .collect(Collectors.toList());
//        var filtered = movies.stream()
//                        .sorted(Comparator.comparingInt(Movie::getYear))
//                                .dropWhile(m -> m.getYear() < 2010)
//                                        .takeWhile(m -> m.getYear() <= 2018)
//                                                .collect(Collectors.toList());
//        var low = movies.stream()
//                        .min(Comparator.comparingDouble(Movie::getBudget)).get();
//        var high = movies.stream()
//                .max(Comparator.comparingDouble(Movie::getBudget)).get();
//        var total = movies.stream()
//                .mapToDouble(m -> m.getBudget())
//                .sum();
//        var actorsNames = movies.stream()
//                        .flatMap(m -> m.getActors().stream())
//                                .map(Person::getName)
//                                        .collect(Collectors.joining("/\\","[[","]]"));
//        System.out.println(actorsNames);
        //filtered.forEach(System.out::println);
//        var sorted = movies.stream()
//                .sorted(Comparator.comparingInt(Movie::getYear))
//                .collect(Collectors.toList());
//        var unique = movies.stream()
//                .flatMap(m -> m.getActors().stream())
//                .map(Person::getName)
//                .collect(Collectors.toCollection(TreeSet::new));
//        var split = movies.stream()
//                        .collect(partitioningBy(m -> m.getYear() >= 2014));
//        split.get(Boolean.TRUE).forEach(System.out::println);
//        System.out.println();
//        split.get(Boolean.FALSE).forEach(System.out::println);

//        var grouped = movies.stream()
//                .collect(groupingBy(Movie::getMovieMaker));
//        var byYear = movies.stream()
//                .collect(groupingBy(Movie::getYear,summingDouble(Movie::getBudget)));
//        byYear.forEach((k,v) -> System.out.printf("%s - %,.2f%n", k, v));
//        var result = movies.stream()
//                .collect(groupingBy(Movie::getMovieMaker,mapping(Movie::getName,toList())));
        var result = movies.stream()
                        .collect(groupingBy(Movie::getMovieMaker,counting()));
        result.forEach((k,v) -> System.out.printf("%s - %s%n", k.getName(), v));
    }
}
