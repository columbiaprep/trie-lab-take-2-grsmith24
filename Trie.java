// Java implementation of search and insert operations
// on Trie
//Stolen and modified from Baeldung

public class Trie {


    //base of the trie
    public static TrieNode root;




    // If not present, inserts key into trie
    // If the key is prefix of trie node,
    // just marks leaf node
    public static void insert(String key) {
     for(int i=0; i<key.length(); i++){
         char currentLetter= key.charAt(i);
         TrieNode[] kids = root.children;
         for(TrieNode k: kids){
             if(currentLetter == k.theLetter){
                 //enter trie node

             }
             else{
                 //add letter
             }
         }
     }
    }
}