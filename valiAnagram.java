import java.util.*;
public class valiAnagram {
    public static void main(String[] args) {
        
        String s = "geeks";
        String t = "skeeg";
        HashMap<Character, Integer> fm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(fm.containsKey(ch)){
                int oc = fm.get(i);
                int nc = oc+1;
                fm.put(ch,nc);
            }else{
                fm.put(ch,1);
            }
        }

        HashMap<Character, Integer> sm = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(fm.containsKey(ch)){
                int oc = sm.get(i);
                int nc = oc+1;
                sm.put(ch,nc);
            }else{
                sm.put(ch,1);
            }
        }

        if(fm=sm){
            System.out.println(true);
            
        } else{ 
            System.out.println(false);
        }

        
        
    }
    
}
