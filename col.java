public class My_Collection<E> {

    public static void main(String[] args) {
        My_Collection<String> a = new My_Collection<>();
        a.add("12");
        a.add("1222");
        System.out.println(a.get(0));
        System.out.println(a.get(1));
    }

    private class Node {
        E data;
        Node next;

        Node() {
            data = null;
            next = null;
        }
    }

    private Node head;

    My_Collection() {
        head = null;
    }

    public E get(int index) {
        E get_data = head.data;
        Node temp = head;
        int counter = 0;
        while (counter != index) {
            temp = temp.next;
            get_data = temp.data;
            counter++;
        }
        return get_data;
    }

    public void add(E element) {
        if (head == null) {
            head = new Node();
            head.data = element;
            head.next = null;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node();
            temp.next.data = element;
            temp.next.next = null;
        }
    }

    public Node getHead() {
        return head;
    }
}
