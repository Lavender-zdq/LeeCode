import common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Offter32III {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        //1 极端处理
        if(root==null) return  new ArrayList<>(0);
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> res = new ArrayList<>();
        int flag=1;
        while (!queue.isEmpty()){
            List<Integer> list=new ArrayList<>();
            for(int i= queue.size();i>0;i--){
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            if(flag%2==0)
                Collections.reverse(list);

            flag++;
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
