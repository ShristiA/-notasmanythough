package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Main {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        ArrayList <String> movies = new ArrayList <>();
        //creating array to store the inputs

        //prompting user to add their values
        System.out.println("enter your favourite movies.");
        for(int i=0; i<5; i++) {
            String input = sc.next();
            movies.add(input);
        }

        Collections.sort(movies);
        for(String movieList : movies) {
            System.out.println(movieList);
        }


    }
}
