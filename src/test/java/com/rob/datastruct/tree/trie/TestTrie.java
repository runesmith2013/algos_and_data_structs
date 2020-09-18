package com.rob.datastruct.tree.trie;

import org.junit.Assert;
import org.junit.Test;

public class TestTrie {

     private Trie createExampleTrie() {
         Trie trie = new Trie();
         trie.insert("Coding");
         trie.insert("is");
         trie.insert("a");
         trie.insert("way");
         trie.insert("of");
         trie.insert("life");

         return trie;
     }

     @Test
     public void testCreateTrie() {
         Trie trie = createExampleTrie();

         Assert.assertFalse(trie.isEmpty());
     }

    @Test
    public void testFindWord() {
        Trie trie = createExampleTrie();

        Assert.assertFalse(trie.find("Coding3"));
        Assert.assertFalse(trie.find("vide"));
        Assert.assertTrue(trie.find("life"));
    }


    @Test
    public void whenDeletingElements_ThenTreeDoesNotContainThoseElements() {
        Trie trie = createExampleTrie();

        Assert.assertTrue(trie.find("Coding"));

        trie.delete("Coding");
        Assert.assertTrue(trie.find("Coding"));
    }



}
