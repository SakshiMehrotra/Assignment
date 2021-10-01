package nnn.demo.prg;

import java.util.*;

public class RemoveProgram {
    public static void main(String[] args) {

        List<Integer> values = new ArrayList();
        values.add(5);
        values.add(4);
        values.add(1);
        values.add(4);
        values.add(6);
        values.remove(2);
        System.out.println(values);
    }
}
