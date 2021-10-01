package nnn.demo.prg;

import java.io.*;
import java.util.HashSet;

public class CheckHashsetProgram {
    public static void main(String[] args){
        HashSet<String> values=new HashSet<String>();
        values.add("RAM");
        values.add("SHYAM");
        values.add("GITA");
        System.out.println(values);
        System.out.println("Set contains element RAM?"+values.contains("RAM"));
        System.out.println("Set contains element SAKSHI?"+values.contains("SAKSHI"));

    }
}
