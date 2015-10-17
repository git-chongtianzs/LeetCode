public void connect(TreeLinkNode root) {
  TreeLinkNode pre=null,head=null,cur=root;
  while(cur!=null){
    while(cur!=null){
      if(cur.left!=null){
        if(pre==null){
          head=cur.left;
        }else
          pre.next=cur.left;
        pre=cur.left;
      }
      if(cur.right!=null){
        if(pre==null){
          head=cur.right;
        }else
          pre.next=cur.right;
        pre=cur.right;
      }
      cur=cur.next;
    }
    cur=head;
    head=null;
    pre=null;
  }
}
