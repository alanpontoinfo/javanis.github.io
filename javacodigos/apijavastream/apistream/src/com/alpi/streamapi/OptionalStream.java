package com.alpi.streamapi;

import java.util.Optional;
public class OptionalStream {
public static void main(String []args) {
Optional<String> string = Optional.of(" abracadabra ");
string.map(String::trim).ifPresent(System.out::println);
}
}