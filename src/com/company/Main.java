package com.company;

import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        Random randGen = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayResult = new ArrayList<>();

        for (int i=0; i<17; i++)
        {
            arrayList.add(randGen.nextInt(100));
        }

        for (int i=0; i<13; i++)
        {
            linkedList.add(randGen.nextInt(100));
        }


        long start1 = System.nanoTime();
        arrayList.add(3,17);
        long start2 = System.nanoTime();
        long delta = start2 - start1;
        System.out.println("ArrayList insert på plads 3 tager: " + (float)delta/1000000 + " milliseconds");

        start1 = System.nanoTime();
        linkedList.add(3,17);
        start2 = System.nanoTime();
        delta = start2 - start1;
        System.out.println("LinkedList insert på plads 3 tager: " + (float)delta/1000000 + " milliseconds");

        start1 = System.nanoTime();
        arrayResult = intersect(arrayList, linkedList);
        start2 = System.nanoTime();
        delta = start2 - start1;
        System.out.println("Intersect result: " + arrayResult);
        System.out.println("Intersect tager: " + (float)delta/1000000 + " milliseconds");
    }

    public static ArrayList<Integer> intersect(ArrayList<Integer> a1, List<Integer> a2)
    {
        //System.out.println("I'm still working. Wait for it...");
        ArrayList<Integer> a3 = new ArrayList<>();
        Integer nummer;
        for(int i=0; i<a1.size(); i++)
        {
            nummer = a1.get(i);
            if (a2.contains(nummer))
            {
                a3.add(nummer);
            }
        }
        return a3;
    }
}
