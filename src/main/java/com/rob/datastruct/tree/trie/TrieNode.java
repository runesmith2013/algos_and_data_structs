package com.rob.datastruct.tree.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

  private Map<Character, TrieNode> children = new HashMap<>();
  private String context;
  private boolean isWord;

    public Map<Character, TrieNode> getChildren() {
        return children;
    }

    public void setChildren(Map<Character, TrieNode> children) {
        this.children = children;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }
}
