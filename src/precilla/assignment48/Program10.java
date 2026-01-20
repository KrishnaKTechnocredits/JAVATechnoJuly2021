package precilla.assignment48;

import java.util.ArrayList;
import java.util.Arrays;


//program 10 : append 0 after 3 consecutive number.
public class Program10 {
    public static void main(String args[]) {
        Integer[] array= {1,2,3,5,4,7};
        System.out.println("input "+Arrays.toString(array));
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(array));
        int count=0,prevNum=0;
        for(int index=0;index<al.size();index++)
        {
            if(count==3)
            {
                count=0;
                if(al.get(index)!=0)
                {
                    al.add(index,0);
                }
            }
            else if(prevNum<al.get(index))
            {
                prevNum=al.get(index);
                count++;
                if( (count==3) && (index==al.size()-1))
                {
                    al.add(index+1,0);
                }
            }
            else
            {
                count=0;
            }
        }

        System.out.println("Arraylist : "+al);
      }
  }


