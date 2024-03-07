// Java implementation of search and insert operations
// on Trie
//Stolen and modified from Baeldung

public class Trie {


    //base of the trie
    public static TrieNode root;




    // If not present, inserts key into trie
    // If the key is prefix of trie node,
    // just marks leaf node
    public static void insert(String key, TrieNode n) {
        //go recursive
        //go character by character
        //base case: key.length()==0
        if(key.length() <2>){
            return;
        }
        else{
            TrieNode[] kids = root.children;

            char currentLetter = key.charAt(0);
            for(TrieNode k: kids){
               if(currentLetter == k.theLetter){
                   //enter trie node

               }
               else{
                   //add letter
               }
           }
            insert(key.substring(1), new TrieNode());

        }
//         for(int i=0; i<key.length(); i++){
//             char currentLetter= key.charAt(i);
//
//             for(TrieNode k: kids){
//                 if(currentLetter == k.theLetter){
//                     //enter trie node
//
//                 }
//                 else{
//                     //add letter
//                 }
//             }
//         }
    }
}