package algexamples.algorithms;

import algexamples.utilities.Utilities;

import java.util.*;

/**
 * Created by Corey on 4/14/2016.
 */
public class BigIntIncrement extends BaseAlgorithm {
    private int mIntOne;
    private String mStrOne;
    private String mStrTwo;
    private Vector<Integer> mIntVect;
    private Vector<String> mStrVector;

    public String getmStrOne() {
        return mStrOne;
    }

    public void setmStrOne(String mStrOne) {
        this.mStrOne = mStrOne;
    }

    public String getmStrTwo() {
        return mStrTwo;
    }

    public void setmStrTwo(String mStrTwo) {
        this.mStrTwo = mStrTwo;
    }


    /**
     * Default Constructor
     */
    public BigIntIncrement() {
        super("Big Integer Incrementer");
    }

    public BigIntIncrement(String one, String two) throws IllegalFormatException {
        this();
        if (validateStr(one)) {
            mStrOne = one;
        } else {
            throw new IllegalArgumentException("String: '" + one + "' has characters other than 0 or 1");
        }
        if (validateStr(two)) {
            mStrTwo = two;
        } else {
            throw new IllegalArgumentException("String: '" + two + "' has characters other than 0 or 1");
        }
        mStrVector = new Vector<>();
    }

    public BigIntIncrement(int one) {
        this();
        mIntOne = one;
        mIntVect = new Vector<>();

    }


    @Override
    public int runAlgorithm() {
        int num = 0;
        num = Utilities.getIntFromConsole("Would you like to run integer algorithm or string variant?\n" +
                "Please enter 1 or 2:");
        boolean validInput = false;
        while (!validInput) {
            if (!(num == 1 || num == 2)) {
                num = Utilities.getIntFromConsole("Invalid input - Please enter 1 or 2:");
            } else {
                validInput = true;
            }
        }
        return runAlgorithm(num);
    }

    public int runAlgorithm(int choice) {
        switch (choice) {
            case 1:
                runIntProb(20);
                break;
            case 2:
                runStrProb();
                break;
            default:
                return 0;
        }
        return 1;
    }

    private void runIntProb(int size) {
        mIntVect = new Vector<>();
        int[] intArray;
        intArray = Utilities.genRandomArray(0, 9, size);
        for (int x : intArray) {
           // mIntVect.add(x);
            mIntVect.add(9);
        }

        printIntVector(0);
        int stepCounter = 1;
        mIntVect.set(mIntVect.size() - 1, mIntVect.lastElement() + 1);
        for (int i = mIntVect.size() - 1; i > 0 && mIntVect.elementAt(i) == 10; i--) {
            mIntVect.set(i, 0);
            mIntVect.set(i - 1, mIntVect.elementAt(i - 1) + 1);
            printIntVector(stepCounter++);
        }

        if (mIntVect.elementAt(0) == 10) {
            mIntVect.set(0, 0);
            mIntVect.insertElementAt(1, 0);
        }
        System.out.println("No More digits to carry, final result:");
        printIntVector(stepCounter++);


    }

    private void printIntVector(int step) {
        System.out.println("Current Array at step " + step + ":");
        System.out.print("[");
        for (int i = 0; i < mIntVect.size(); i++) {
            System.out.print(mIntVect.elementAt(i));
            if (!(i == mIntVect.size() - 1)) {
                System.out.print(",");
            } else System.out.println("]\n");
        }
    }

    private void runStrProb() {

    }

    @Override
    public String getCurrentStep() {
        return null;
    }

    private boolean validateStr(String input) {
        for (char ch : input.toCharArray()) {
            if (!(ch == '0' || ch == '1')) {
                return false;
            }
        }
        return true;
    }
}
