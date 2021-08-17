package by.goncharov.runner;

import by.goncharov.service.*;

import java.util.Arrays;

public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int[] array = new int[]{5, 6, 7, 2, 4, 1, 7};
        ShellSort.shellSort(array);
        System.out.println(Arrays.toString(array));
    }
}
