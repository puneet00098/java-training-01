package org.example;

import org.example.primeNos.PrintPrimeNos;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PrintPrimeNos ppn = new PrintPrimeNos();
        Scanner  scan = new Scanner(System.in);
        System.out.println("hello ! we are here to trace prime numbers.\b please enter comma sperated numbers");
        String inputNumList = scan.nextLine();
        List<Integer> retList = ppn.printPrimeNums(inputNumList);
        System.out.println(retList);
        System.out.println( "Hello World!" );
    }
}
