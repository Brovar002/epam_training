package by.goncharov.service;

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
