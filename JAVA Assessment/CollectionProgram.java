package nnn.demo.prg;
import java.util.Collection;
import java.util.*;

public class CollectionProgram
{
    public static void main(String[] args){
        //Set <Integer> values=new HashSet<Integer>();
        List  <Integer> values=new ArrayList();
        values.add(5);//object type
        values.add(6);
        values.add(9);
        values.add(2);
        values.add(7);
        values.add(1);
        values.add(4,5);
        Iterator it=values.iterator();
        //values.add("Sakshi");
        //Collection <Integer> values=new ArrayList<Integer>();
        //Collection <Integer> values=new ArrayList<Integer>();
        //for(int i=0;i<6;i++){
          //  System.out.println(values.get(i));
        //}
        System.out.println(values);


        //while(it.hasNext()){
          //  System.out.println(it.next());
        //}

    }
}
