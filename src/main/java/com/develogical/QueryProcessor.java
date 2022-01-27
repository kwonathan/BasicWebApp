package com.develogical;

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

        return "";
    }
}
