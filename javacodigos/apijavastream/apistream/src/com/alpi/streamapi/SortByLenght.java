package com.alpi.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
public class SortByLenght {
public static void main(String []args) {
List words =
Arrays.asList("follow your heart but take your brain with you".split(" "));
Comparator<String> lengthCompare = (str1, str2) -> str1.length() - str2.length();
words.stream().distinct().sorted(lengthCompare).forEach(System.out::println);
}
}