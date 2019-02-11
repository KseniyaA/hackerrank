package tree_graphs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class TreeNode {
    /**
     * Корень
     */
    private Integer root;

    /**
     * Левое поддерево
     */
    private TreeNode left;

    /**
     * Правое поддерево
     */
    private TreeNode right;

    public TreeNode(Integer root) {
        this.root = root;
    }
}
