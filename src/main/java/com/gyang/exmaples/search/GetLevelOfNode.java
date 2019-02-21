package com.gyang.exmaples.search;

public class GetLevelOfNode
{
    public static int getLevelOfNode(NodeTree root, int key, int level) {
        if(root == null)
            return 0;
        if(root.value == key)
            return level;
        int result=getLevelOfNode(root.left, key, level+1);
        if(result != 0) {
            return result;
        }
        return getLevelOfNode(root.right, key, level+1);
    }
}
