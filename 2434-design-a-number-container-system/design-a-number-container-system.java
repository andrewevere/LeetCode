class NumberContainers {
    Map<Integer, Integer> idxToNum;
    Map<Integer, TreeSet<Integer>> numToIndices;

    public NumberContainers() {
        idxToNum = new HashMap<>();
        numToIndices = new HashMap<>();
    }
    
    public void change(int index, int number) {
        if (idxToNum.containsKey(index)){
            int oldNum = idxToNum.get(index);
            numToIndices.get(oldNum).remove(index);
        }
        idxToNum.put(index,number);
        numToIndices.computeIfAbsent(number, k -> new TreeSet<>()).add(index);
    }
    
    public int find(int number) {
        if (!numToIndices.containsKey(number) || numToIndices.get(number).isEmpty()){
            return -1;
        }
        return numToIndices.get(number).first();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */