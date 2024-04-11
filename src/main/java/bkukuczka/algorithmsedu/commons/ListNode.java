package bkukuczka.algorithmsedu.commons;

public class ListNode<T> {
    public T value;
    public ListNode<T> next;

    public ListNode(T value, ListNode<T> next) {
        this.value = value;
        this.next = next;
    }
}
