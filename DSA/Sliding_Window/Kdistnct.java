import java.util.HashSet;
public class Kdistnct{
    public static void main(String[] args){
        HashSet<Character> set=new HashSet<>();
        Character[] arr = {'a','v','s','x','s','s','v','d'};
        for(Character ch:arr){
            set.add(ch);
        }
        System.out.println(set);
    }
}