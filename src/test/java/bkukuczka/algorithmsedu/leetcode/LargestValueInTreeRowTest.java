package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.BinaryTreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LargestValueInTreeRowTest {
    @Test
    void largestValuesInTreeRows() {
        //given
        var node6 = new BinaryTreeNode<>(9, null, null);
        var node5 = new BinaryTreeNode<>(3, null, null);
        var node4 = new BinaryTreeNode<>(5, null, null);
        var node3 = new BinaryTreeNode<>(3, node4, node5);
        var node2 = new BinaryTreeNode<>(2, null, node6);
        var node1 = new BinaryTreeNode<>(1, node3, node2);

        //when
        List<Integer> result = new LargestValueInTreeRow().largestValues(node1);

        //then
        assertThat(result.get(0)).isEqualTo(1);
        assertThat(result.get(1)).isEqualTo(3);
        assertThat(result.get(2)).isEqualTo(9);
    }

}