package by.gsu.pmslab;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClaculatorThread extends Thread{


    public int calculator(int numberThread, int borderValue){
        ExecutorService executor = Executors.newFixedThreadPool(numberThread);
        int result;
        result = 1;
        for (int i = 1; i <= borderValue; i++){
            if(i%2 == 0)
                result *= i;
        }
        executor.shutdown();
        return result;
    }

}
