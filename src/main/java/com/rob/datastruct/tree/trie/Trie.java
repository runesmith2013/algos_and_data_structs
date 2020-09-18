package com.rob.datastruct.tree.trie;


/**
 * A variant of an n-ary tree which stores characters at each node.
 * Each path down the tree results in a valid word
 *
 * * nodes (null nodes) indicate end of word
 *
 * Uses:
 *  - store an entire language for quick prefix lookups.
 *  Hashtables can verify whether a word is valid but not a prefix - tries can do this in o(k) time, where K is length of string
 */
public class Trie {

     private TrieNode root = new TrieNode();

     //-- set current node as root
    //-- set the current letter as first letter of word
    //-- if the current node has reference to the letter, great! else create a new trienode

    //-- complexity is O(n) as we need to iterate over every character
     public void insert(String word) {
         TrieNode current = root;

         for (char l: word.toCharArray()) {
             current = current.getChildren().computeIfAbsent(l, c-> new TrieNode());
         }
         current.setWord(true);
     }

     //-- get children of the root
    //-- iterate through each character
    //-- check whether character is in the sub trie. if no, fail
    //-- repeat
    // -- this is O(n)
     public boolean find(String word) {
         TrieNode current = root;

         for (int i = 0; i < word.length(); i++) {
             char ch = word.charAt(i);
             TrieNode node = current.getChildren().get(ch);

             if (node == null) {
                 return false;
             }
             current = node;
         }
         return current.isWord();
     }

     public void delete(String word) {
         delete(root, word, 0);
     }


     //-- check that this is part of the trie
    //-- if found, remove from trie
    //-- O(n) where n is length of key
     private boolean delete(TrieNode current, String word, int index) {
         if (index == word.length()) {
             if (!current.isWord()) {
                 return false;
             }
             current.setWord(false);
             return current.getChildren().isEmpty();
         }

         char ch = word.charAt(index);
         TrieNode node = current.getChildren().get(ch);
         if (node == null) {
             return false;
         }

         boolean shouldDelete = delete(node, word, index+ 1) && !node.isWord();

         if (shouldDelete) {
             current.getChildren().remove(ch);
             return current.getChildren().isEmpty();
         }
         return false;
     }



    public boolean isEmpty() {
         return root.getChildren().isEmpty();
    }
}
