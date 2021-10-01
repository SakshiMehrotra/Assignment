package nnn.demo.prg;
import java.util.*;

public class ListInterface {
    public static void main(String[] args){
        List <Integer> I1=new ArrayList<Integer>();
        I1.add(0,1);
        I1.add(1,2);
        System.out.println(I1);
        List <Integer> I2=new ArrayList<Integer>();
        I2.add(1);
        I2.add(2);
        I2.add(3);
        I1.addAll(1,I2);
        System.out.println(I1);
        System.out.println(I1.get(3));
        I1.remove(1);
        System.out.println(I1);
        I1.set(1,100);
        System.out.println(I1);
        System.out.println(I1.indexOf(100));
        AbstractList<Integer> arr= new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        System.out.println("ArrayList: "+arr);
        int value=arr.get(3);
        System.out.println("element at index 3: "+value);
        int n=5;
        Vector<Integer> v=new Vector<Integer>(n);
        for(int i=1;i<=n;i++){
            v.add(i);
        }
        System.out.println(v);

    }
}
