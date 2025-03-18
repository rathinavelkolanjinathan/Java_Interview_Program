package org.test.dataStructure.array;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TwoDimentionalArray {
    private static final Logger logger = Logger.getLogger(TwoDimentionalArray.class.toString());

    public static void main(String[] args) {

        /*int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int max = array[0][0]; // assume that the first element is the maximum
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("The maximum value is: " + max);*/


      /*      int a[][] = {{2,5,7,9},{3,6,8,1}};
       //int t= TWODIEMNTIONALARRAYMAX.getMaxNumber(a);
      //  System.out.println("maximum number is"+t);
            int max=a[0][0];
            for (int i=0; i<2; i++) //row
            {
                for (int j=0; j<4; j++) //coloum
                {
                    if(a[i][j]>max)
                    {
                        max=a[i][j];
                    }
                }
            }
            System.out.println("maximum number is"+max);*/


        int[][] arr = {{1, 5, 6, 16, 8, 9}, {9, 1, 3, 4, 7, 6}, {1, 2, 4, 7, 3, 8}};

        //set list of rows
        List<Integer> rowNums = Arrays.asList(1);
        //set list of columns
        List<Integer> colNums = Arrays.asList(1, 5);

        int maxVal = rowNums.stream().map(i -> arr[i - 1])
                .flatMapToInt(innerArr -> colNums.stream()
                        .mapToInt(i -> innerArr[i - 1]))
                .max().getAsInt();

        logger.info("two dimentional " + maxVal);
    }

    public static int getMaxNumber(int[][] array) {
        IntSummaryStatistics stats = Stream.of(array)
                .flatMapToInt(IntStream::of)
                .summaryStatistics();
        return stats.getMax();
    }


}

