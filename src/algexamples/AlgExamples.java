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
        myAlgorithms.add(new BigIntIncrement());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean quit = false;
        int algCode = 0;
        AlgExamples menu = new AlgExamples();
        while(!quit) {
            algCode = menu.displayMenu();
            if(algCode==0){
                quit = true;
            }
            if(algCode!=0) {
                System.out.println("Algorithm finished with code: " + algCode);
            }
        }
        System.out.println("Exiting...");
        System.exit(0);
    }

    /**
     * Display main menu to the user
     */
    private int displayMenu() {
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
            return 0;
        } else {
            int code = myAlgorithms.get(num - 1).runAlgorithm();
            return code;
        }
    }
}
