package mylist;

public class MyLinkedList extends MyAbstractList {
    MyLinkedListNode head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    @Override
    public void add(Object o) {
        add(o, size);
    }
    @Override
    public void add(Object o, int index) {
        checkBoundaries(index, size);
        if (index == 0) {
            head = new MyLinkedListNode(o, head);
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            current.setNext(new MyLinkedListNode(o, current.getNext()));
        }
        size++;
    }
    @Override
    public Object get(int index) {
        MyLinkedListNode current = getNodeByIndex(index);
        return current.getPayload();
    }

    @Override
    public void remove(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            current.next = current.next.next;
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }
}
