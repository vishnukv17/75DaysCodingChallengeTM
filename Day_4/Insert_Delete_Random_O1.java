class RandomizedSet {

    Map<Integer,Integer> map;
    List<Integer> list;
    
    public RandomizedSet() {
        map= new HashMap<Integer,Integer>();
        list=new ArrayList<Integer>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val))
            return false;
        else{
            list.add(val);
            map.put(val,list.size()-1);
        }
            
        return true;
    }
    
    public boolean remove(int val) {
        
        if(map.containsKey(val)){
            list.set(map.get(val),list.get(list.size()-1));
            map.replace(list.get(list.size()-1),map.get(val));
            list.remove(list.size()-1);
            map.remove(val);
            return true;
        }
        return false;
    
        
    }
    
    public int getRandom() {
       int rand=ThreadLocalRandom.current().nextInt(0, list.size());
        return(list.get(rand));
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */