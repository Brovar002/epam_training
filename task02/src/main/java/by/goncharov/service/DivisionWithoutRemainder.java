package by.goncharov.service;

/**
 * Class for find number's divisions.
 * @author Goncharov Daniil
 * @version 1.0
 * @see by.goncharov.controller.DivisionWithoutRemainderCommand
 */

public class DivisionWithoutRemainder {
    int i = 1;
    int k;
    char ch;
    public int division(int n) {
       for (i = 1; i < n; i++){
           String str = Integer.toString(i);
           boolean flag = false;
           for(k = 0; k < str.length(); k++) {
               if(n % Character.getNumericValue(ch) == 0) {
                   flag = true;
               }
               else {
                   flag = false;
               }
               if(flag == true) {
                   return n;
               }
           }
       }
        return n;
    }
}
