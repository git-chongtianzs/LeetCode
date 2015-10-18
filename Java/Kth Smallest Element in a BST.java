public int kthSmallest(TreeNode root, int k) {
  Stack<TreeNode> st=new Stack<>();
  TreeNode cur=root;
  int count=0;
  while(cur!=null){
    st.push(cur);
    cur=cur.left;
  }
  while(!st.isEmpty()){
    cur=st.pop();
    count++;
    if(count==k)
      return cur.val;
    cur=cur.right;
    while(cur!=null){
      st.push(cur);
      cur=cur.left;
    }
  }
  return -1;
}
