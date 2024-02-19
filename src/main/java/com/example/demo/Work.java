package com.example.demo;

public class Work {

    int num50=0;
    int num25=0;
    int num10=0;
    int num5=0;
    int num1=0;
    public void countCoins(int value) {

        if(value >= 0)
        {
            
            num50= (value/50);
            value = (value%50);

        }
        if(value >= 25)
        {
             num25 = (value/25);
             value = (value%25);
        }
        if(value >= 10)
        {
             num10 = (value/10);
             value = (value%10);
        }
        if(value >= 5)
        {
             num5 = (value/5);
            value = (value%5);
        }
        if(value >= 1)
        {
             num1 = value/(1);
             value = (value%1);
        }

        System.out.println("50 : " + num50 + " 25 : " + num25 + " 10 : " + num10 + " 5 : " + num5 + " 1 : " + num1);


    }
    public static void main(String[] args) {

        Work work = new Work();

        work.countCoins(381);

    }

}
// 50, 25, 10, 5, 1







