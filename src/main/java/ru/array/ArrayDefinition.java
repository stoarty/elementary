package ru.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[5];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Ivan Ivanov";
        names[1] = "Petr Petrov";
        names[2] = "Anna Annina";
        names[3] = "Marina Marinina";
        System.out.println("ages length = " + ages.length);
        System.out.println("surnames length = " + surnames.length);
        System.out.println("prices length = " + prices.length);
        for (String name : names) {
            System.out.println(name);
        }
    }

}
