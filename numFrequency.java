import java.util.*;

public class numFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the sentance: ");
        String text = scn.nextLine();
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0; i<text.length();i++){
            char ch = text.charAt(i);
            if(hm.containsKey(ch)){
                int of = hm.get(ch);
                int nf = of+1;
                hm.put(ch, nf);
            }else{
                hm.put(ch, 1);
            }
        }

        char mfc = text.charAt(0);

        for(Character key: hm.keySet()){
            if(hm.get(key)>mfc){
                mfc = key;
            }
        }
        System.out.println("This character "+"'"+mfc+"' appearing "+hm.get(mfc)+" times");

    }
}
