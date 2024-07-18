package com.kanishka.springwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWebappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebappApplication.class, args);
        System.out.println(42 + 22 + " is my favorite number.");

        System.out.println("My favorite number is " + 42);

        System.out.format("Fav numb %.3f.\n", 3.141592654);

        System.out.format("%2d %2d %2d\n", 4,6,8);

        System.out.format("%2d %2d %2d\n", 8,12,16);

    }

}
