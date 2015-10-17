public void connect(TreeLinkNode root){
  if(root==null||root.left==null)
    return;
  TreeLinkNode pre=root,cur=root.left;
  while(cur!=null){
    while(pre!=null){
      pre.left.next=pre.right;
      if(pre.next!=null)
        pre.right.next=pre.next.left;
      pre=pre.next;
    }
    pre=cur;
    cur=pre.left;
  }
}
