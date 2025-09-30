package com.pluralsight.week2;

public class FullNameParser {
    public static void main(String[] args) {
        fullNameParser2("Maaike Van Putten");
    }

    //without split
    public static void fullNameParser1(String name) {
        name = name.trim();
        // variables for name parts
        String firstName = "";
        String middleName = "(none)";
        String lastName = "";

        // look for spaces, twice
        int space1Index = name.indexOf(" ");
        // taking the substring, so we need to add the previous indices to it
        int subSpace2Index = name.substring(space1Index + 1).indexOf(" ");
        int space2Index = subSpace2Index + space1Index + 1;

        // if we don't find a second space, we know it's a two part name
        if(subSpace2Index == -1) {
            firstName = name.substring(0, space1Index);
            lastName = name.substring(space1Index + 1);
        } else {
            firstName = name.substring(0, space1Index);
            middleName = name.substring(space1Index + 1, space2Index);
            lastName = name.substring(space2Index + 1);
        }

        printName(firstName, middleName, lastName);

    }
    // with split
    public static void fullNameParser2(String name) {
        name = name.trim();

        // variables for name parts
        String firstName = "";
        String middleName = "(none)";
        String lastName = "";

        // splitting the name and store in an array
        String[] arrFullName = name.split("\\s+");

        // check the length of the array
        // if length equal to 3, populate all the fields
        // else if length equal to 2, populate first name and last name
        // else invalid input

        if(arrFullName.length  == 3) {
            firstName = arrFullName[0];
            middleName = arrFullName[1];
            lastName = arrFullName[2];
        } else if(arrFullName.length  == 2) {
            firstName = arrFullName[0];
            lastName = arrFullName[1];
        } else {
            System.out.println("Invalid name format!");
            return;
        }

        // print the name
        printName(firstName, middleName, lastName);

    }

    public static void printName(String firstName, String middleName, String lastName) {
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

    }
}
