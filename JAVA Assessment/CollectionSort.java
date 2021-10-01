package nnn.demo.prg;
import java.util.*;

public class CollectionSort {
    public static void main(String[] args){
        List<Integer> values=new ArrayList<>();
        values.add(5);
        values.add(4);
        values.add(1);
        values.add(4);
        values.add(6);
        values.add(2);
        Comparator<Integer> c=new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {

                return i%10 > j%10 ? 1: -1;
            }
        };
        Collections.sort(values,c);
        for(Integer o :values)
        {
            System.out.println(o);
        }

    }
}
