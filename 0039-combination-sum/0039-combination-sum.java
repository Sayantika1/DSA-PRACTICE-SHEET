class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(ans,candidates,target,0,temp );
        return ans;
    }

    public  void solve(List<List<Integer>> ans, int[] candidates, int target,int index, List<Integer> temp)
    {
        if(target == 0)
        {
            ans.add(new ArrayList<>(temp));
            return ;
        }
        if(index==candidates.length || target< 0 )
        {
            return;
        }

        temp.add(candidates[index]);
        solve(ans,candidates,target - candidates[index],index,temp);
        temp.remove(temp.size() - 1);
        solve(ans,candidates,target,index +1, temp);

    }
}