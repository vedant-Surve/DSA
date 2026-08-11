import java.util.HashMap;
public class Main{
    public static void main(String[] args){
        HashMap<String,Integer> empIDs= new HashMap<>();
        empIDs.put("vedant",1234);
        empIDs.put("Riddesh",9876);
        empIDs.put("Dishant",7780);
        System.out.println(empIDs);
        System.out.println(empIDs.get("vedant"));
        System.out.println(empIDs.containsKey("Riddesh"));
        System.out.println(empIDs.containsValue(9876));
    }
}