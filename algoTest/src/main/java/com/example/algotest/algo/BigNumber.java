package com.example.algotest.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BigNumber {

    public String solution(int[] numbers) {
        ArrayList<String> list = new ArrayList<>();

        Arrays.stream(numbers).forEach(x -> list.add(Integer.toString(x)));

        String result = list.stream()
                .sorted((o1, o2) -> (o2+o1).compareTo(o1+o2))
                .collect(Collectors.joining(""));

        if (result.charAt(0) == '0') {
            return "0";
        }

        return result;
    }

    public String solution1(int[] numbers) {
        return Arrays.stream(numbers)
               .mapToObj(String::valueOf)
               .sorted((s1, s2) -> -s1.concat(s2).compareTo(s2.concat(s1)))
               .reduce("", (s1, s2) -> s1.equals("0") && s2.equals("0") ? "0" : s1.concat(s2));
    }
}
