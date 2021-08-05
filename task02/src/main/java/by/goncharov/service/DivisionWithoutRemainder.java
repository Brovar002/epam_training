package by.goncharov.service;

/**
 * Class for find number's divisions.
 * @author Goncharov Daniil
 * @version 1.0
 * @see by.goncharov.contoller.DivisionWithoutRemainderCommand
 */

public class DivisionWithoutRemainder {
    boolean bool;
    int i = 1;
    int k;
    int d;
    int c;
    public int division(int n) {
       for (i = 1; i < n; i++){
           c = n;
           while (c != 0){
               k++;
               if(c % 10 != 0){
                   if(n % (c % 10) == 0){
                       d++;
                   }
               }
               c = c % 10;
           }
           if(d == k){
               return c;
           }
       }
        return c;
    }
}
