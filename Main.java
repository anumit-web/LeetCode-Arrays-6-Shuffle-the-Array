/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        System.out.println("Final Value of Variable After Performing Operations");

        Solution solution = new Solution();

        int[] input1 = {2,5,1,3,4,7};
        int n1 = 3;
        int[]  count1 = solution.shuffle(input1, n1);
        System.out.println("Count = " + Arrays.toString(count1));

        int[] input2 = {1,2,3,4,4,3,2,1};
        int n2 = 4;        
        int[]  count2 = solution.shuffle(input2, n2);
        System.out.println("Count = " +  Arrays.toString(count2));

    }
}


