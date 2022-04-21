class MyHashSet {
    ArrayList<Integer> arr ;
    public MyHashSet() {
        arr = new ArrayList<>() ;
        
    }
    
    public void add(int key) {
        if(arr.size() == 0){
            arr.add(key);
        }
     for(int i = 0 ; i < arr.size() ; i++){
            if(arr.get(i) == key) return;
            else {
                continue ;
            }
        }
        arr.add(key);
        return ;
    }
    
    public void remove(int key) {
          for(int i = 0 ; i < arr.size() ; i++){
            if(arr.get(i) == key){
              arr.remove(i);
                return ;
            } 
            else {
                continue ;
            }
        }
        return ;
    }
    
    public boolean contains(int key) {
        
        for(int i = 0 ; i < arr.size() ; i++){
            if(arr.get(i) == key) return true ;
            else {
                continue ;
            }
            
        }
        return false ;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */