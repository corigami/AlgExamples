/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algexamples.algorithms;

import algexamples.utilities.Utilities;

/**
 *
 * @author Corey
 */
public class DutchFlag extends BaseAlgorithm {

    // Sort the input array, the array is assumed to
    // have values in {0, 1, 2}
    public DutchFlag() {
    }

    @Override
    public String getTitle() {
        return "Dutch Flag Problem";
    }

    static void sort012(int a[], int arr_size) {
        int lo = 0;
        int hi = arr_size - 1;
        int mid = 0, temp = 0;
        while (mid <= hi) {
            printSortState(a, arr_size, lo, mid, hi);
            switch (a[mid]) {
                case 0: {
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    System.out.println("Value is 0, swap with low index,"
                            + " advance pivot and low index");
                    break;
                }
                case 1:
                    mid++;
                    System.out.println("Value is 1, advance pivot");
                    break;
                case 2: {
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    System.out.println("Value is 2, swap with high index"
                            + " and reduce high index");
                    break;
                }
            }

        }
        printSortState(a, arr_size, lo, mid, hi);
    }

    static void sort0123(int a[], int arr_size) {
        int lo = 0;
        int hi = arr_size - 1;
        int mid = 0, temp = 0;
        int lp = 0, rp = 0, counter = 0;

        //do one pass to count number of "low" items for pointers
        for (int i = 0; i < arr_size; i++) {
            if (a[i] == 0 || a[i] == 1) {
                counter++;
            }
        }
        rp = counter;
        lp = counter - 1;
        System.out.println("RP=" + rp + "    LP = " + lp);

        while (mid < hi) {
            printSortState(a, arr_size, lo, mid, hi, lp, rp);
            switch (a[mid]) {
                case 0: {
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    System.out.println("Value is 0, swap with low index,"
                            + " advance pivot and low index");
                    break;
                }
                case 1:
                    temp = a[lp];
                    a[lp] = a[mid];
                    a[mid] = temp;
                    lp--;
                    System.out.println("Value is 1, swap with lp and reduce lp index");
                    break;
                case 2: {
                    temp = a[rp];
                    a[rp] = a[mid];
                    a[mid] = temp;
                    rp++;
                    System.out.println("Value is 2, swap with rp and increase rp index"
                            + " and reduce high index");
                    break;
                }
                case 3: {
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    System.out.println("Value is 3, swap with high index"
                            + " and reduce high index");
                    break;
                }
            }
            if (mid == lp) {
                mid = rp;
            }
        }
        printSortState(a, arr_size, lo, mid, hi, lp, rp);
    }

    /* Utility function to print array arr[] */
    static void printArray(int arr[], int arr_size) {
        int i;
        for (i = 0; i < arr_size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print('\n');
    }

    /* Utility function to print array arr[] */
    static void printSortState(int arr[], int arr_size, int low, int mid, int hi) {
        printArray(arr, arr_size);
        for (int i = 0; i <= arr_size; i++) {
            if (i == low || i == mid || i == hi) {
                System.out.print("| ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.print('\n');
        for (int i = 0; i <= arr_size; i++) {
            if (i == low && i == mid) {
                System.out.print("lm");
            } else if (i == mid && i == hi) {
                System.out.print("hm");
            } else if (i == low) {
                System.out.print("l ");
            } else if (i == mid) {
                System.out.print("m ");
            } else if (i == hi) {
                System.out.print("h ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.print("\n");
    }

    static void printSortState(int arr[], int arr_size, int low, int mid, int hi, int lp, int rp) {
        boolean lessSpace = false;
        printArray(arr, arr_size);
        for (int i = 0; i <= arr_size; i++) {
            if (i == low || i == mid || i == hi || i == lp || i == rp) {
                System.out.print("| ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.print('\n');
        for (int i = 0; i <= arr_size; i++) {
            if (i == low && i == mid) {
                System.out.print("lm");
                lessSpace = true;
            } else if (i == mid && i == hi) {
                System.out.print("hm");
                lessSpace = true;
            } else if (i == mid && i == lp) {
                System.out.print("lpm");
                lessSpace = true;
            } else if (i == mid && i == rp) {
                System.out.print("rpm");
                lessSpace = true;
            } else if (i == low) {
                System.out.print("l");
            } else if (i == mid) {
                System.out.print("m");
            } else if (i == hi) {
                System.out.print("h");
            } else if (i == lp) {
                System.out.print("lp");
                lessSpace = true;
            } else if (i == rp) {
                System.out.print("rp");
                lessSpace = true;
            } else {
                System.out.print(" ");
                lessSpace = false;
            }
            if (!lessSpace) {
                System.out.print(" ");
                lessSpace = false;
            }
        }
        System.out.print("\n");
    }

    /*Driver function to check for above functions*/
    public static void main(String[] args) {

    }

    @Override
    public int runAlgorithm() {
        run012();
        //run0123();
        return 1;
    }

    @Override
    public String getCurrentStep() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void run012() {
        int arr[] = Utilities.genRandomArray(0, 2, 20);
        sort012(arr, arr.length);
        System.out.println("Array after seggregation ");
        printArray(arr, arr.length);
    }

    private void run0123() {
        int arr2[] = Utilities.genRandomArray(0, 3, 20);
        sort0123(arr2, arr2.length);
        System.out.println("Array after seggregation ");
        printArray(arr2, arr2.length); 
    }

}
