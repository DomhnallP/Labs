package lab3;

import java.util.*;

public class Solution{
    
    public static String[] myarray;

    public static void main(String[] args){
        
        Scanner myscanner = new Scanner(System.in);
        int num = Integer.parseInt(myscanner.nextLine());
        String[] array = new String[num];
        myarray = new String[num];
        for(int i=0;i<num;i++){
            myarray[i]=myscanner.nextLine();
        }
      
        //sort(); // you need to write this method
        
        for(int i=0;i<num;i++){
            System.out.println(myarray[i]);
        }
    }
    

    
    public static void sort(String[] array){
    }
}