import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class offter32II {
    //从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。

    public static List<List<Integer>> levelOrder(TreeNode root) {
        //极端处理
        if(root==null)
            return new ArrayList<>(0);

        //初始化
        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
         queue.add(root);
         List<List<Integer>> res=new ArrayList<>();
         while (!queue.isEmpty()){
             List<Integer> list=new ArrayList<>();



             //for(int i= 0;i>queue.size();i++)  错误 queue.size()每一次for循环都有变化的可能性
             //如果int i= queue.size() 需要这个初始值，就是每一层的节点数
             for(int i= queue.size();i>0;i--) {
                 TreeNode node = queue.poll();
                 list.add(node.val);
                 if(node.left!=null) queue.add(node.left);
                 if(node.right!=null) queue.add(node.right);

             }

             res.add(list);
         }
         return res;

    }

    //[3,9,20,null,null,15,7]
    public static void main(String[] args) {
        TreeNode init = init();
        List<List<Integer>> lists = levelOrder(init);
        System.out.println(lists);


    }

    public static TreeNode init(){
        TreeNode root=new TreeNode(3);

        TreeNode node9=new TreeNode(9);

        TreeNode node20=new TreeNode(20);

        TreeNode node15=new TreeNode(15);
        TreeNode node7=new TreeNode(7);

        node20.left=node15;
        node20.right=node7;

        root.right=node20;
        root.left=node9;

        return root;

    }
}
