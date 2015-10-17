//Morris traversal(inorder)
public void recoverTree(TreeNode root){
	TreeNode cur=root,tmp=null;
	TreeNode fir=null,sec=null,pre=null;
	while(cur!=null){
		if(cur.left==null){
			if(pre!=null&&pre.val>cur.val){
				if(fir==null)
					fir=pre;
				sec=cur;
			}
			pre=cur;
			cur=cur.right;
		}else{
			tmp=cur.left;
			while(tmp.right!=null&&tmp.right!=cur)
				tmp=tmp.right;
			if(tmp.right==null){
				tmp.right=cur;
				cur=cur.left;
			}else{
				if(pre!=null&&pre.val>cur.val){
					if(fir==null)
						fir=pre;
					sec=cur;
				}
				tmp.right=null;
				pre=cur;
				cur=cur.right;
			}
		}
	}
	int temp=fir.val;
	fir.val=sec.val;
	sec.val=temp;
}
