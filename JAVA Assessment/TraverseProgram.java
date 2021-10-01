package nnn.demo.prg;
import java.util.*;

public class TraverseProgram {
    public static void main(String[] args){
        List <Integer> values=new ArrayList();
        values.add(5);
        values.add(4);
        values.add(1);
        values.add(4);
        values.add(6);
        values.add(2);
        for(int i=0;i<values.size();i++){
            System.out.print(values.get(i)+" ");
        }
    }
}
