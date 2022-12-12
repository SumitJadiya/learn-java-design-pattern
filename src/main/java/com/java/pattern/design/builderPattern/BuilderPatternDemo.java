package com.java.pattern.design.builderPattern;

import com.java.pattern.design.builderPattern.builder.User;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        User userOne = new User.UserBuilder("Virat", "Kohli").age(32).phone("12324355").address("some random address").build();
        System.out.println(userOne);

        User userTwo = new User.UserBuilder("Jack", "Reacher")
                .age(40)
                .phone("5655")
                //no address
                .build();

        System.out.println(userTwo);

        User userThree = new User.UserBuilder("Super", "Man")
                //No age
                //No phone
                //no address
                .build();

        System.out.println(userThree);
    }
}
