import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListsExamples {

    public static void main(String args[])
    {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for(int i=1;i<=20;i++)
        {
            integerArrayList.add(i);
        }

        System.out.println(integerArrayList);

        integerArrayList.remove(17);
        System.out.println(integerArrayList);

        integerArrayList.remove(13);
        System.out.println(integerArrayList);

        integerArrayList.remove(11);
        System.out.println(integerArrayList);

        integerArrayList.remove(5);
        System.out.println(integerArrayList);


        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("Anish");
        namesArrayList.add("Atul");
        namesArrayList.add("Mikhael");
        namesArrayList.add("Naman");

        for(int i=0;i<namesArrayList.size();i++)
        {
            System.out.println(namesArrayList.get(i));
        }

        Iterator iterator = namesArrayList.iterator();

        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }

        ArrayList<String> alphabets = new ArrayList<>();

        alphabets.add("A");
        alphabets.add("B");
        alphabets.add("C");
        alphabets.add("D");
        alphabets.add("E");

        Collections.reverse(alphabets);
        System.out.println(alphabets);

    }

}
