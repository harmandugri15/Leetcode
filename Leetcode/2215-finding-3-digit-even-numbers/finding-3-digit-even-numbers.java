class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer> hs=new HashSet<>();
        int n=digits.length;
        for(int i=0;i<n;i++){
            if(digits[i]==0){
                continue;
            }
            for(int j=0;j<n;j++){
                if(j==i){
                    continue;
                }
                for(int k=0;k<n;k++){
                    if(k==i || k==j){
                        continue;
                    }
                    if(digits[k]%2==1){
                        continue;
                    }
                    int nums=digits[i]*100+digits[j]*10+digits[k];
                    hs.add(nums);
                }
            }
        }
        int[] arr=new int[hs.size()];
        int index=0;

        for(int i:hs){
            arr[index++]=i;
        }
        Arrays.sort(arr);
        return arr;
    }
}