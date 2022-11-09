import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Offter32 {


    //从上到下打印二叉树
    public int[] levelOrder(TreeNode root) {
        //特例处理 根节点为空
        if(root ==null)
            return new int[0];
        List<Integer> list=new ArrayList<>();
        //初始化队列
        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(root);

        while(!treeNodes.isEmpty()){
            TreeNode item = treeNodes.poll();
            list.add(item.val);
            if(item.left!=null){
                treeNodes.add(item.left);
            }
            if(item.right!=null)
                treeNodes.add(item.right);
        }

//        int[] res = list.stream().mapToInt(Integer::intValue).toArray();

        Integer[] integers = list.toArray(new Integer[list.size()]);
        int[] res=new int[integers.length];
        for(int i=0;i<integers.length;i++){
            res[i]=integers[i];

        }
        return res;




    }
}
