package bkukuczka.algorithmsedu;

import bkukuczka.algorithmsedu.commons.BinaryTreeNode;
import bkukuczka.algorithmsedu.commons.TreeNode;
import bkukuczka.algorithmsedu.tree.TreeTraversal;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;

class TreeTraversalTest {

    /**
     *              1
     *           /  |  \
     *          3   2   4
     *        /  \
     *       5    6
     */
    @Test
    void postorderTraversal() {
        //given
        TreeNode<Integer> node6 = new TreeNode<>(6, emptyList());
        TreeNode<Integer> node5 = new TreeNode<>(5, emptyList());
        TreeNode<Integer> node4 = new TreeNode<>(4, emptyList());
        TreeNode<Integer> node3 = new TreeNode<>(3, List.of(node5, node6));
        TreeNode<Integer> node2 = new TreeNode<>(2, emptyList());
        TreeNode<Integer> node1 = new TreeNode<>(1, List.of(node3, node2, node4));

        TreeTraversal algo = new TreeTraversal();

        //when
        List<Integer> result = algo.postorder(node1);

        //then
        assertThat(result).isEqualTo(List.of(5, 6, 3, 2, 4, 1));
    }

    /**
     *          1
     *        /   \
     *       4     2
     *     /  \   /
     *    6   5  3
     */
    @Test
    void inorderTraversal() {
        //given
        BinaryTreeNode<Integer> node6 = new BinaryTreeNode<>(6, null, null);
        BinaryTreeNode<Integer> node5 = new BinaryTreeNode<>(5, null, null);
        BinaryTreeNode<Integer> node4 = new BinaryTreeNode<>(4, node6, node5);
        BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(3, null, null);
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(2, node3, null);
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(1, node4, node2);

        TreeTraversal algo = new TreeTraversal();

        //when
        List<Integer> result = algo.inorder(node1);

        //then
        assertThat(result).isEqualTo(List.of(6, 4, 5, 1, 3, 2));
    }

    /**
     *              1
     *           /  |  \
     *          3   2   4
     *        /  \
     *       5    6
     */
    @Test
    void preorderTraversal() {
        //given
        TreeNode<Integer> node6 = new TreeNode<>(6, emptyList());
        TreeNode<Integer> node5 = new TreeNode<>(5, emptyList());
        TreeNode<Integer> node4 = new TreeNode<>(4, emptyList());
        TreeNode<Integer> node3 = new TreeNode<>(3, List.of(node5, node6));
        TreeNode<Integer> node2 = new TreeNode<>(2, emptyList());
        TreeNode<Integer> node1 = new TreeNode<>(1, List.of(node3, node2, node4));

        TreeTraversal algo = new TreeTraversal();

        //when
        List<Integer> result = algo.preorder(node1);

        //then
        assertThat(result).isEqualTo(List.of(1, 3, 5, 6, 2, 4));
    }
}