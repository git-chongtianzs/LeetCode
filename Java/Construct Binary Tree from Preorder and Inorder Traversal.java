//O(n)
public TreeNode buildTree(int[] preorder, int[] inorder) {
  if(preorder.length==0)
    return null;
  Stack<TreeNode> st=new Stack<>();
  TreeNode root=new TreeNode(preorder[0]);
  st.push(root);
  int p=1,i=0;
  while(p<preorder.length){
    if(!st.isEmpty()&&inorder[i]==st.peek().val){
      TreeNode node=st.pop();
      if(++i>=inorder.length)
        break;
      if(!st.isEmpty()&&inorder[i]==st.peek().val)
        continue;
      node.right=new TreeNode(preorder[p++]);
      st.push(node.right);
     
    }else{
      TreeNode left=new TreeNode(preorder[p++]);
      st.peek().left=left;
      st.push(left);
    }
  }
  return root;
}
