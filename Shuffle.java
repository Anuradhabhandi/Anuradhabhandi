import java.awt.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    LinkedList<Integer> list = new LinkedList<Integer>();  
        //Add values in the list  
        list.add(1);  
        list.add(2);  
        list.add(3);  
        list.add(4);  
        list.add(5);  
        list.add(6);
        list.add(7);
          System.out.println("List before Shuffle : "+list);  
          Collections.shuffle(list);  
          System.out.println("List after shuffle : "+list);  
	}

}
