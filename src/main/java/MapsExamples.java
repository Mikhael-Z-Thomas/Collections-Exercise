
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapsExamples {

    public static void main(String args[])
    {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");

        Iterator iterator = map.entrySet().iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        map.forEach((key,value)->System.out.print(key+"-"+ value+" "));


    }

}
