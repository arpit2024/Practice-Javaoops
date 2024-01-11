package PrintNoTask;

public class client {
    public static void main(String args[]){
        System.out.println("name of my thread is "+Thread.currentThread().getName());
        for(int i=0;i<1000;i++){
            printnotaskhundred task=new printnotaskhundred(i);
            Thread t=new Thread(task);
            t.start();
        }
    }
}
