import java.util.*;
/**
 * Write a description of class IndexEntry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IndexEntry
{
   private String word;
   private ArrayList<Integer> numsList;
   
   public IndexEntry(String s){
       word = s.toUpperCase();
       numsList = new ArrayList<Integer>();
   }
   public void add(int num){
    if (numsList.contains(num) == false){
        numsList.add(num);
    }
    }
   public String getWord(){
    return this.word;
    }
   public String toString(){
     StringBuilder sb = new StringBuilder();
     for (int i=0; i<numsList.size(); i++){
        sb.append(numsList.get(i));
        if (i!=numsList.size()-1){
            sb.append(", ");
        }
     }
     return this.word + sb.toString();
     
      // String output = word + numsList.toString();
       // return output;

   }
}
