import java.util.*;

public class Huffman{

    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       
       while(true){
       String sentence = in.nextLine();
       String binaryString=""; 
       
       
       for(int i=0; i < sentence.length(); i++){        //go through the sentence
           int decimalValue = (int)sentence.charAt(i);      //convert to decimal
           String binaryValue = Integer.toBinaryString(decimalValue);      //convert to binary
           for(int j=7;j>binaryValue.length();j--){
               binaryString+="0";           //this loop adds in those pesky leading zeroes
            }
           binaryString += binaryValue+" "; //add to the string of binary
       }
          
              
       int[] array = new int[256];      //an array to store all the frequencies
       
       for(int i=0; i < sentence.length(); i++){    //go through the sentence
           array[(int)sentence.charAt(i)]++;    //increment the appropriate frequencies
           
       }
       
       
       PriorityQueue < Tree >  PQ = new PriorityQueue < Tree >() ;  //make a priority queue to hold the forest of trees    
        
       
       for(int i=0; i<array.length; i++){ //go through frequency array
           if(array[i]>0){ //print out non-zero frequencies - cast to a char
               Tree myTree = new Tree();    //create a new Tree 
               myTree.frequency = array[i]; //set the cumulative frequency of that Tree
               myTree.root=new Node();      //insert the letter as the root node 
               myTree.root.letter = (char)i;
               myTree.alpha=i;
               PQ.add(myTree);              //add the Tree into the PQ
            }
        }
        
        
        while(PQ.size()>1){
            Tree firstTree = PQ.poll(); 
            Tree secondTree = PQ.poll();
            
           
            
            Tree comboTree = new Tree();   
            
            comboTree.frequency=firstTree.frequency+secondTree.frequency;  
            comboTree.root=new Node();      
            comboTree.root.leftChild=firstTree.root; 
            comboTree.root.rightChild=secondTree.root;
          
        
            if(firstTree.frequency==secondTree.frequency)
            {
            	if(firstTree.alpha>secondTree.alpha)
            	{
            		comboTree.root.leftChild=secondTree.root;    
            	}
            }
            comboTree.alpha=Math.min(firstTree.alpha,secondTree.alpha);
            
            PQ.add(comboTree); 
        }
        
        Tree HuffmanTree = PQ.poll();   //now there's only one tree left - get its codes
        int totalLength=0;              //keeps track of the length of the new compressed version
        String theCode;
        for(int i=0; i<sentence.length(); i++){
            theCode=HuffmanTree.getCode(sentence.charAt(i));
            System.out.print(theCode);  //get the code for the letter
            totalLength+=theCode.length();  //track the length of the solution
        }
      }  //keeps the whole thing looping forever 
    }      
}
