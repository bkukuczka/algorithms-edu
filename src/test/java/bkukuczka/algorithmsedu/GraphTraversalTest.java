package bkukuczka.algorithmsedu;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;

class GraphTraversalTest {

    @Test
    void postorderTraversal() {
        //given
        GraphNode<Integer> node6 = new GraphNode<>(6, emptyList());
        GraphNode<Integer> node5 = new GraphNode<>(5, emptyList());
        GraphNode<Integer> node4 = new GraphNode<>(4, emptyList());
        GraphNode<Integer> node3 = new GraphNode<>(3, List.of(node5, node6));
        GraphNode<Integer> node2 = new GraphNode<>(2, emptyList());
        GraphNode<Integer> node1 = new GraphNode<>(1, List.of(node3, node2, node4));

        GraphTraversal algo = new GraphTraversal();

        //when
        List<Integer> result = algo.postorder(node1);

        //then
        assertThat(result).isEqualTo(List.of(5, 6, 3, 2, 4, 1));
    }
}