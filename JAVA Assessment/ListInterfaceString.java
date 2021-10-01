package nnn.demo.prg;
import java.util.*;

public class ListInterfaceString {
    public static void main(String[] args){
        List<String> I1=new ArrayList<String>();
        I1.add(0,"RAM");
        I1.add(1,"SHYAM");
        System.out.println(I1);
        List <String> I2=new ArrayList<String>();
        I2.add("GITA");
        I2.add("SITA");
        I2.add("MOHAN");
        I1.addAll(1,I2);
        System.out.println(I1);
        System.out.println(I1.get(3));
        I1.remove(1);
        System.out.println(I1);
        I1.set(1,"JOHN");
        System.out.println(I1);
        System.out.println(I1.indexOf("JOHN"));
    }

}
