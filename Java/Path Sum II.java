public List<List<Integer>> pathSum(TreeNode root, int sum){
  List<List<Integer>> res=new LinkedList<List<Integer>>();
  pathSumhelper(root,sum,new LinkedList<Integer>(),res);
  return res;
}
private void pathSumhelper(TreeNode root, int sum,List<Integer> cur,List<List<Integer>> res){
  if(root==null)
    return;
  cur.add(root.val);
  if(root.left==null&&root.right==null){
    if(sum==root.val){
      res.add(new LinkedList<Integer>(cur));
    }
    cur.remove(cur.size()-1);
    return;
  }
  pathSumhelper(root.left,sum-root.val,cur,res);
  pathSumhelper(root.right,sum-root.val,cur,res);
  cur.remove(cur.size()-1);
}
