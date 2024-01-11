package Prototype;

public class Client {
    public static void fillRegistry(StudentRegistry registry){
        Student sep22Prototype=new Student();
        sep22Prototype.setBatchName("sep22");
        sep22Prototype.getAvgBatchPsp("85.0");

        registry.register(sep22,sep22Prototype);

    }
    public static void main(String[] args){
        StudentRegistry registry=new StudentRegistry();
        fillRegistry(registry);

        Student vipul=registry.get("sep22").clone();
        vipul.setName("vipul");
        vipul.setAge(25);
        vipul.setPsp(99);

        Student bijit = registry.get("Sept22").clone();
        bijit.setName("Bijit");
        bijit.setAge(26);
        bijit.setPsp(95);

        Student shuhail = registry.get("Sept22Intellijent").clone();
        shuhail.setName("Shuhail");
        shuhail.setAge(26);
        shuhail.setPsp(90);


    }
}
