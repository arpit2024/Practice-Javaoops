package Prototype;

public class StudentRegistry {
    HashMap<String,Student>hm=new HashMap<>();
    public void register(String key,Student st){
        hm.put(key,st);
    }
    public Student get(String key){
        return hm.get(key);
    }
}
