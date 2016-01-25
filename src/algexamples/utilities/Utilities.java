/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algexamples.utilities;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author Corey
 */
public class Utilities {
    
    /**
     * Generates an array of random elements
     * @param low - starting of range of allowable {integer}
     * @param max - max {integer} to be generated
     * @param size - how big the array should be
     * @return
     */
    public static int[] genRandomArray(int low, int max ,int size){
        Random random = new Random();
        IntStream intStream = random.ints(low,max+1);
        int[] array =  intStream.limit(size).toArray();
        return array;
    }
    
    /**
     * Prompts the user and returns the response
     * @param prompt
     * @return
     */
    public static String getStringInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println(prompt);
        input = scanner.nextLine();
        return input;
    }
    
        public static int getInt(String prompt){
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println(prompt);
        input = scanner.nextInt();
        return input;
    }
}
