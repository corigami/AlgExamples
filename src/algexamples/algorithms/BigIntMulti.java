/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates

import java.util.Random;

/**
 * and open the template in the editor.
 */
package algexamples.algorithms;

import algexamples.utilities.Utilities;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

/*
 * @author Corey
 */
public class BigIntMulti extends BaseAlgorithm {

    String num1;
    String num2;
    String output;

    public BigIntMulti() {
    }

    final void init(int size) {
        assert(size > 0 );
        num1 = "";
        num2 = "";
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                if (rand.nextBoolean()) {
                    num1 = "-";
                }
                if (rand.nextBoolean()) {
                    num2 = "-";
                }
            }
            num1 = num1 + Integer.toString(rand.nextInt(10));
            num2 = num2 + Integer.toString(rand.nextInt(10));
        }
    }

    @Override
    public int runAlgorithm() {
        assert (!num1.isEmpty());
        assert (!num2.isEmpty());
        init(Utilities.getInt("How many digits in your big numbers?"));
        
        System.out.println(num1 + " x " + num2);
        System.out.println(multiplyInt());

        return 1;
    }

    @Override
    public String getTitle() {
        return "Big Integer Mulitplication";
    }

    @Override
    public String getCurrentStep() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void printNum(ArrayList<Integer> bigNum) {
        for (Integer num : bigNum) {
            System.out.print(num);
        }
        System.out.println();

    }

    private String multiplyInt() {
        boolean isPositiveVal = true;
        String result = "";

        if (num1.substring(0, 1).equals("-")) {
            isPositiveVal = !isPositiveVal;
            num1 = num1.substring(1, num1.length());
        }

        if (num2.substring(0, 1).equals("-")) {
            isPositiveVal = !isPositiveVal;
            num2 = num2.substring(1, num2.length());
        }

        num1 = new StringBuffer(num1).reverse().toString();
        num2 = new StringBuffer(num2).reverse().toString();

        ArrayList<Integer> bigNum = new ArrayList<>(num1.length() + num2.length());

        for (int i = 0; i < num1.length(); i++) {
            for (int j = 0; j < num2.length(); j++) {
                int k = i + j;
                int num1i = Character.getNumericValue(num1.charAt(i));
                int num2j = Character.getNumericValue(num2.charAt(j));

                if (bigNum.size() < k + 1 || bigNum.isEmpty()) {
                    bigNum.add(k, 0);
                }
                if (bigNum.size() < (k + 2)) {
                    bigNum.add(k + 1, 0);
                }

                bigNum.set(k, bigNum.get(k) + num1i * num2j);
                bigNum.set(k + 1, bigNum.get(k + 1) + (int) bigNum.get(k) / 10);
                bigNum.set(k, bigNum.get(k) % 10);
            }
        }
        for (Integer num : bigNum) {
            result += num.toString();
        }
        result = new StringBuffer(result).reverse().toString();
        while (result.charAt(0) == '0') {
            result = result.substring(1);
        }
        if (!isPositiveVal) {
            result = "-" + result;
        }
        System.out.println("--------------------");
        return result;
    }

}
