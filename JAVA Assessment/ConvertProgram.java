package nnn.demo.prg;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class ConvertProgram {
    public static void main(String[] args){
        List <Integer> values=new ArrayList();
        values.add(5);
        values.add(4);
        values.add(1);
        values.add(4);
        values.add(6);
        values.add(2);
        Integer[] arr=values.toArray(new Integer[0]);
            System.out.print(values);

    }
}
