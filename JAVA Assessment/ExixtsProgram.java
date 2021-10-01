package nnn.demo.prg;
import java.util.*;
import java.util.ArrayList;
public class ExixtsProgram {
    public static void main(String[] args){
        ArrayList <Integer> values=new ArrayList<>();
        values.add(5);
        values.add(4);
        values.add(1);
        values.add(4);
        values.add(6);
        values.add(2);
        if(values.indexOf(5)>=0)
            System.out.println("5 exists");
        else
            System.out.println("5 does not exists");
        if(values.indexOf(9)>=0)
            System.out.println("9 exists");
        else
            System.out.println("9 does not exists");
        if(values.indexOf(1)>=0)
            System.out.println("1 exists");
        else
            System.out.println("1 does not exists");


    }
}
