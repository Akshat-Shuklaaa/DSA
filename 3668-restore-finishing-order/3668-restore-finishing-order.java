class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int ans[] = new int[friends.length];
        int k=0;
        for(int i=0;i<order.length;i++){
            for(int j=0;j<friends.length;j++){
                if(order[i]==friends[j]){
                    ans[k++]=friends[j];
                    break;
                }
            }
            if(ans[ans.length-1]!=0)
                break;
        }
        return ans;
    }
}