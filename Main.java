import java.io.*;
import java.util.*
import java.util.ArrayList;



public class Main {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        File f =new File("names.txt");
        try{
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String n = s.nextLine();
                names.add(n);
            }
        }
        catch (Exception e){

        }
        for(String s: names){
            Trie.insert(s);
        }
        System.out.println(names);
    }



}
