import java.util.*;

public class genericTree{

    static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node){
        String str = node.data + "->";
        for(Node child : node.children){
            str+=child.data+",";
        }

        str+=".";
        System.out.println(str);

        for(Node child : node.children){
            display(child);
        }
    }

    public static int size(Node node){
        int size = 0;
        for(Node child: node.children){
            int cs = size(child);
            size+=cs;
        }
        size++;
        return size;
    }

    public static int maximum(Node node){
        int max = node.data;

        for(Node child: node.children){
            int newMax = maximum(child);
            max = Math.max(newMax,max);
        }
        max = Math.max(max, node.data);
        return max;
    }

    public static int height(Node node){
        int ht = -1;
        for(Node child: node.children){
            int ch = height(child);
            ht = Math.max(ch, ht);
        }
        ht++;
        return ht;
    }

    public static void traversal(Node node){

        System.out.println("Pre Node:- " + node.data);

        for(Node child:node.children){
        System.out.println("Pre Edge:- " + child.data);
        traversal(child);
        System.out.println("Post Edge:- " + child.data);
        }

        System.out.println("Post Node:- " + node.data);

    }
    public static void main(String[] args) {
        Node root=null;

        int[] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,-1,100,-1,-1,-1};
        Stack<Node> st = new Stack<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i] == -1){
                if(!st.isEmpty()){
                    st.pop();
                }
                
            }else{
                Node t = new Node();
                t.data = arr[i];

                if(!st.isEmpty()){
                    st.peek().children.add(t);
                } else{
                    root = t;
                }
                st.push(t);
                
            }
        }
        display(root);
        int sz = size(root);
        System.out.println("Size: "+sz);

        int max = maximum(root);
        System.out.println("Max: "+max);

        int hgt = height(root);
        System.out.println("Height: "+hgt);

        traversal(root);
        

    }
}