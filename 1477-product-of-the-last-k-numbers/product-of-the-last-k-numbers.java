class ProductOfNumbers {
    private List<Integer> nums;
    private List<Long> prefixProducts;
    
    public ProductOfNumbers() {
        nums = new ArrayList<>();
        prefixProducts = new ArrayList<>();
        prefixProducts.add(1L);
    }
    
    public void add(int num) {
        if (num == 0){
            prefixProducts = new ArrayList<>();
            prefixProducts.add(1L);
        }else {
            long last = prefixProducts.get(prefixProducts.size() - 1);
            prefixProducts.add(last * num);
        }
    }
    
    public int getProduct(int k) {
        int n = prefixProducts.size();
        if (k >= n){
            return 0;
        }
        
        long total = prefixProducts.get(n - 1);
        long removePart = prefixProducts.get(n - 1 - k);
        return (int)(total / removePart);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */