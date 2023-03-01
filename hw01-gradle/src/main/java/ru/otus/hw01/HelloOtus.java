package ru.otus.hw01;

import com.google.common.base.Preconditions;
import java.util.Scanner;

public class HelloOtus {
    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);
        print(scanner.nextLine());
    }

    public static void print(String arg) {
        Preconditions.checkState(!arg.isEmpty(), "Cannot be empty!");
    }
}
