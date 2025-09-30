package com.pluralsight.week2;

public class StringsExplained {
    public static void main(String[] args) {
        String text = "    blabla\\";
        System.out.println(text);
        text = text.trim();
        System.out.println(text);
        text = text.toUpperCase();
        System.out.println(text);

        boolean startsWithBla = text.startsWith("bla");
        System.out.println(startsWithBla);

        String text2 = "  Java is fun!   ";
        System.out.println("original: " + text2);
        System.out.println("modified: " + text2.trim().toUpperCase());
        System.out.println(text2);

        String names = "Wiesje and Zia";
        int indexZ = names.indexOf("Z");
        String name = names.substring(indexZ);
        System.out.println(name);
        System.out.println(names);

        String[] arrNames = {"Vice", "Nicolas", "Emmanuel"};
        System.out.println(arrNames[1]);

        String namesWithPipe = "Vice|Nicolas|Emmanuel";
        String[] namesArray = namesWithPipe.split("\\|");
        System.out.println(namesArray[0]);
        System.out.println(namesArray[1]);
        System.out.println(namesArray[2]);

    }
}
