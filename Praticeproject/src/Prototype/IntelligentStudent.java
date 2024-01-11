package Prototype;

public class IntelligentStudent extends Student implements prototype<IntelligentStudent>{
    private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
