package bkukuczka.algorithmsedu;

class ListNode<T> {
    ListNode<T> next;
    T value;

    ListNode(ListNode<T> next, T value) {
        this.next = next;
        this.value = value;
    }
}
