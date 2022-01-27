package com.develogical;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("imperial")) {
            return "Imperial College is a university in London";
        }

        if (query.toLowerCase().contains("horse")) {
            return "horse is a mammal";
        }

        if (query.toLowerCase().contains("your name")) {
            return "WASD";
        }

        if (query.toLowerCase().contains("plus")) {
            String regex = "\\d+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(query);

            ArrayList<Integer> array = new ArrayList<>();

            while(matcher.find()) {
                array.add(Integer.parseInt(matcher.group()));
            }

            int sum = 0;
            for (int num : array) {
                sum += num;
            }

            return String.valueOf(sum);
        }

        if (query.toLowerCase().contains("multiplied")) {
            String regex = "\\d+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(query);

            ArrayList<Integer> array = new ArrayList<>();

            while(matcher.find()) {
                array.add(Integer.parseInt(matcher.group()));
            }

            int product = 1;
            for (int num : array) {
                product *= num;
            }

            return String.valueOf(product);
        }

        if (query.toLowerCase().contains("largest")) {
            String regex = "\\d+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(query);

            ArrayList<Integer> array = new ArrayList<>();

            while(matcher.find()) {
                array.add(Integer.parseInt(matcher.group()));
            }

            int largest = 0;
            for (int num : array) {
                if (num >= largest) {
                    largest = num;
                }
            }

            return String.valueOf(largest);
        }

        if (query.toLowerCase().contains("largest")) {
            String regex = "\\d+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(query);

            ArrayList<Integer> array = new ArrayList<>();

            while(matcher.find()) {
                array.add(Integer.parseInt(matcher.group()));
            }

            int square_cube;

            for (int num : array) {
                double num_to_check = Math.sqrt((num));
                if (num_to_check == (int)num_to_check) {
                    double num_to_check_cube = Math.cbrt((num));
                    if (num_to_check_cube == (int) num_to_check_cube) {
                        return String.valueOf(num);
                    }
                }
            }

            return "";
        }

        if (query.toLowerCase().contains("colour is a banana")) {
            return "yellow";
        }

        if (query.toLowerCase().contains("james bond in the film dr no")) {
            return "Sean Connery";
        }

        if (query.toLowerCase().contains("Eiffel")) {
            return "Paris";
        }

        return "";
    }
}
