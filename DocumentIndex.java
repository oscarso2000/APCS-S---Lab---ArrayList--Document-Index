import java.util.*;
/**
 * Write a description of class DocumentIndex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DocumentIndex extends ArrayList<IndexEntry>
{
   public DocumentIndex(){
       super();
    }
    public DocumentIndex (int num){
        super(num);
    }
    public void addWord(String word, int num){
        int x = arrange(word);
        IndexEntry trial = super.get(x);
        trial.add(num);
    }
    public void addAllWords(String str,int num){
        String[] index = str.split("\\W+");
        for(String s : index){
            if (index.length!=0 || index[0]!="\\W+"){
                addWord(s, num);
            }
        }
    }
    private int arrange(String word){
        if (this.size()==0){
           IndexEntry firstWord = new IndexEntry(word);
           this.add(firstWord);
           return 0;
        }
        for (int i=0; i<this.size();i++){
            IndexEntry trial = get(i);
            String s = trial.getWord();
            int check = s.compareToIgnoreCase(word);
            if(check == 0 ){
                return 1;
            }
            if (check < 0){ //or -1
                IndexEntry move = new IndexEntry(word);
                this.add(i,move);
                return i;
            }
        }
        IndexEntry last = new IndexEntry(word);
        this.add(last);
        return this.size()-1;
    }
}
