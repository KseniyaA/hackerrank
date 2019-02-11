package tree_graphs;

/**
 *  Given a sorted (increasing order) array with unique integer elements, write an
 * algorithm to create a binary search tree with minimal height.
 *
 * середина массива будет свляться вершиной дерева
 * 1) вставляем в дерево элемент массива
 * 2) вставляем в левое поддерево элемент из левой части массива
 * 3) вставляем в правое поддерево элемент из правой части массива
 *
 */
// todo подумать как реализовать
public class MinimalTreeSolution {
    public TreeNode createMinimalTreeDepth(int arr[], int startIdx, int endIdx) {
        if (endIdx < 0) {
            return null;
        }
        int middleIdx = (endIdx - startIdx)/2 + startIdx;
        TreeNode treeNode = new TreeNode(arr[middleIdx]);

        treeNode.setLeft(createMinimalTreeDepth(arr, 0, middleIdx-1));
        treeNode.setRight(createMinimalTreeDepth(arr, middleIdx+1, arr.length));
        return treeNode;
    }

    public static void main(String[] args) {
    }
}
