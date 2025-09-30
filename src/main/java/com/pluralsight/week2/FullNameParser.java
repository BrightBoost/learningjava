package com.pluralsight.week2;

public class FullNameParser {
    public static void main(String[] args) {
        fullNameParser1("Maaike Putten");
    }

    //without split - Dana Wyatt
    public static void fullNameParser1(String name) {
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

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

    }
    // with split
    public static void fullNameParser2(String name) {

    }
}
