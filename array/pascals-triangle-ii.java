class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < rowIndex + 1 ; i++){
            List<Integer> sublist = new ArrayList<>();
            for (int j = 0; j <= i ; j++){
                if (j == 0 || j == i){
                    sublist.add(1);
                }else{
                    sublist.add(list.get(i-1).get(j) + list.get(i - 1).get(j - 1));
                }
            }
            list.add(sublist);
        }

        return list.get(rowIndex);
    }
}