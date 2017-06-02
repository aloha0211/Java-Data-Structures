/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02_04;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author Producer
 */

public class LinkedListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<>();
        states.add("Alaska");
        states.add("Arizona");
        states.add("Arkansas");
        states.add("Pennsylvania");
        states.add("California");
        states.add("Colorado");
        states.add("Connecticut");

        states.addFirst("Alabama");
        System.out.println(states);
        System.out.println("last state in my list: " + states.getLast());

        ListIterator<String> iterator = states.listIterator(states.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }


}


