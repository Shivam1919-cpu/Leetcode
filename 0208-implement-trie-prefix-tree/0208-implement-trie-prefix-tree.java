class Trie {
    private class Node {
        Node[] children = new Node[26];
        boolean eow = false; 
    }

    private Node root;

    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        int level = 0;
        int len = word.length();
        int indx = 0;

        Node curr = root;
        for(; level < len;level++){
            indx = word.charAt(level) - 'a';
            if(curr.children[indx] == null){
                curr.children[indx] = new Node();
            }
            curr = curr.children[indx];
        }
        curr.eow = true;
    }
    
    public boolean search(String word) {
        int level = 0;
        int len = word.length();
        int indx = 0 ;

        Node curr = root;
        for(; level<len;level++){
            indx = word.charAt(level) - 'a';
            if(curr.children[indx] == null){
                return false;
            }
            curr = curr.children[indx];
        }
        return curr.eow ;
        }
    
     
    public boolean startsWith(String prefix) {
        Node curr = root;
        for(int i = 0; i<prefix.length();i++){
            int indx = prefix.charAt(i) - 'a';
            if(curr.children[indx] == null){
                return false;
            }
            curr = curr.children[indx];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */