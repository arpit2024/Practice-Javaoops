package PrintNoTask;

public class printnotaskhundred implements Runnable{
    private int noToprint;
    public printnotaskhundred(Integer x){
        noToprint=x;
    }

    @Override
    public void run() {
        System.out.println("no is: "+noToprint+" name is: "+Thread.currentThread().getName());
    }
}
