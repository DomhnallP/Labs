import java.util.ArrayList;
import java.util.Scanner;

class Scrabble {

  public static void main(String args[])
  {

    Scanner scan = new Scanner(System.in);
    System.out.println("What leters do you have?: ");
    String letters = scan.next().toLowerCase(); // Change to lowercase to match exact words.

    FileIO reader = new FileIO();
   String[] dictionary = reader.load("X:/Documents/Projects/Labs/CS211Lab4/src/dictionary.txt");
    //String[] dictionary = new String[10]; // Reading the File as a String array.
    System.out.println(dictionary[99900]);
   /* dictionary[0]="dog";
    dictionary[1]="cat";
    dictionary[2]="amphetamine";
    dictionary[3]="super";
    dictionary[4]="analytic";
    dictionary[5]="disaster";
    dictionary[6]="twist";
    dictionary[7]="mouth";
    dictionary[8]="twelve";
   dictionary[9]="nothing";
   */
    
    // Array list to store all the possible words that can be made.
    ArrayList<String> possibleWords = new ArrayList<String>();
    int longestWord = 1;

    // Loop through each word in dictionary and check if that word can be formed with our letters.
    for(int i = 0; i < dictionary.length; i++) 
    {
      String word = dictionary[i];
      //System.out.println(word);
      if(isAWord(letters, word)) { // If we can form this word with our letters.
        if(word.length() >= longestWord) { // If longer than the longest possible word we have so far, add it to the list.
          longestWord = word.length();
          System.out.println(word);
          possibleWords.add(word);
        }
      }
    }

    System.out.println("\nThe longest word that can be formed is one with " + longestWord + " letters:");

    // Loop through possible words and print the largest possible words.
    for (int i = 0; i < possibleWords.size(); i++) {
      String word = possibleWords.get(i);
      if(word.length() == longestWord) System.out.println(word);
    }
  }
  /* Method checks if the passed in word can be formed with the letters we have. */
  public static boolean isAWord(String letters, String word) {

    // Foreach char check if that letter exists, if it does remove from letter string as we have used them.
    for(char c : word.toCharArray()) 
    {
      int charIndex = letters.indexOf(c);
      if(charIndex == -1) return false; // If not found, the word can't be formed.
      letters = letters.substring(0, charIndex) + letters.substring(charIndex + 1);
    }
    return true; // Making this word is possible with the set of letters we have.
  }

}