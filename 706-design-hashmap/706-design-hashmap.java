class MyHashMap {
    
    int currMax = 1000;
    Integer[] vals = new Integer[currMax];
    
    public MyHashMap() {
        vals = new Integer[currMax];
    }
    
    public void put(int key, int value) {
        if (key > currMax){
            this.currMax += (key - currMax + 1);
            this.vals = Arrays.copyOf(vals, currMax);
        }
        this.vals[key] = value;

    }
    
    public int get(int key) {
        if (key > currMax){
            return -1;
        }
        return this.vals[key] != null ? this.vals[key] : -1;
        
    }
    
    public void remove(int key) {
        if (key > currMax){
            return;
        }
        this.vals[key] = null;       
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */