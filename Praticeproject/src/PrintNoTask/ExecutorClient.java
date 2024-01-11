package PrintNoTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorClient {
    public static void main(String args[]){
        System.out.println("name of my thread is "+Thread.currentThread().getName());
        ExecutorService es= Executors.newFixedThreadPool(50);
        for(int i=0;i<1000;i++){
            printnotaskhundred task=new printnotaskhundred(i);
            es.submit(task);
        }
    }
}
