package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    String name;
    String lastname;
    String street;
    String zipcode;
    String city;

    public void initialize() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your lastname");
        lastname = br.readLine();
        System.out.println("Enter your name");
        name = br.readLine();
        System.out.println("Enter your street");
        street = br.readLine();
        System.out.println("Enter your zipcode");
        zipcode = br.readLine();
        System.out.println("Enter your city");
        city = br.readLine();


    }

    public void Dabi1_56330() {
        System.out.println("Display the data");
        System.out.println("*******************");
        System.out.println("Lastname :" + lastname);
        System.out.println("Name :" + name);
        System.out.println("Street :" + street);
        System.out.println("Zipcode :" + zipcode);
        System.out.println("City :" + city);

    }
}
