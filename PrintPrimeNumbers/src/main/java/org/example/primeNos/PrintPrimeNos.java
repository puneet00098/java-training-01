package org.example.primeNos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintPrimeNos {

    private Integer[] primeArr = {2,3,5,7};

    public List<Integer> printPrimeNums(String inputNumList){
        List<Integer> primeList = new ArrayList<>();
        List<String> receiveNoList = Arrays.asList(inputNumList.split(","));
        for(String str:receiveNoList) {
            int x = Integer.valueOf(str);
            boolean isPrime = true;
            for(int i:primeArr){
                if((x%i == 0)&&!(Arrays.asList(primeArr).contains(x))){
                    isPrime =false;
                }
            }
            if(isPrime)
                primeList.add(x) ;
        }
        return primeList;
    }
}
