/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algexamples;

import algexamples.algorithms.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Corey
 */
public class AlgExamples {
    ArrayList<BaseAlgorithm> myAlgorithms;

    /**
     * Default Constructor
     */
    public AlgExamples() {
        myAlgorithms = new ArrayList<>();
        myAlgorithms.add(new DutchFlag());
        myAlgorithms.add(new BigIntMulti());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlgExamples menu = new AlgExamples();
        menu.displayMenu();
    }

    /**
     * Display main menu to the user
     */
    private void displayMenu() {
        System.out.println("****************************");
        System.out.println("0 - Exit");
        int i = 1;
        for (BaseAlgorithm alg : myAlgorithms) {
            System.out.println(i + " - " + alg.getTitle());
            i++;
        }
        System.out.println("****************************");
        System.out.println("What algorithm would you like to run?");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num == 0) {
            System.exit(0);
        } else {
            int code = myAlgorithms.get(num - 1).runAlgorithm();
            System.out.println("Finished with code: " + code);
        }
    }
}
