package bkukuczka.algorithmsedu;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;

class TreeTraversalTest {

    @Test
    void postorderTraversal() {
        //given
        TreehNode<Integer> node6 = new TreehNode<>(6, emptyList());
        TreehNode<Integer> node5 = new TreehNode<>(5, emptyList());
        TreehNode<Integer> node4 = new TreehNode<>(4, emptyList());
        TreehNode<Integer> node3 = new TreehNode<>(3, List.of(node5, node6));
        TreehNode<Integer> node2 = new TreehNode<>(2, emptyList());
        TreehNode<Integer> node1 = new TreehNode<>(1, List.of(node3, node2, node4));

        TreeTraversal algo = new TreeTraversal();

        //when
        List<Integer> result = algo.postorder(node1);

        //then
        assertThat(result).isEqualTo(List.of(5, 6, 3, 2, 4, 1));
    }
}