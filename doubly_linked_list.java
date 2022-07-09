package dsa;

class Node {

    int value;
    Node next, prev;

    Node(int value) {
        this.value = value;
        next = null;
        prev = null;
    }
}

class Dll {

    private Node head;
    private Node tail;
    int length;

    public Dll(int value) {
        Node newnode = new Node(value);
        head = newnode;
        tail = newnode;
        length++;

    }

    public void getHead() {
        System.out.println("head is :" + head.value);
    }

    public void getTail() {
        System.out.println("tail is :" + tail.value);
    }

    public void getLenght() {
        System.out.println("Lenght is :" + length);
    }

    public void print_list() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println("");
    }

    public void append_list(int value) {
        Node newnode = new Node(value);
        if (length == 0) {
            head = tail = newnode;

        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
        length++;
    }

    public void remove_last() {
        if (length == 0) {
            System.out.println("empty list");

        } else if (length == 1) {
            head = null;
            tail = null;
        } else {
            Node temp = tail;
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
            length--;

        }

    }

    public void prepend(int value) {
        Node newnode = new Node(value);
        if (length == 0) {
            head = tail = newnode;
        } else {
            head.prev = newnode;
            newnode.next = head;
            head = newnode;
        }
        length++;
    }

    void remove_First() {
        if (length == 0) {
            System.out.println("list is empty");
        } else if (length == 1) {
            head = tail = null;
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
            head.prev = null;
        }
        length--;
    }

    public Node get_index_element(int index) {
        if (length == 0) {
            return null;
        } else if (length == 1) {
            return head;
        } else if (index < (length / 2)) {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            Node temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
            return temp;
        }

    }

    public void set(int index, int val) {
        Node get = get_index_element(index);
        get.value = val;
        System.out.println("Value updated");
    }

    public void insert(int index, int val) {
        Node newNode = new Node(val);
        Node before = get_index_element(index - 1);
        Node after = before.next;
        if (index < 0 || index > length) {
            System.out.println("errror");
        } else {
            newNode.next = after;
            newNode.prev = before;
            after.prev = newNode;
            before.next = newNode;
            length++;
        }

    }

    public void remove(int index) {
        if (index < 0 || index > length - 1) {
            System.out.println("null");
        } else if (index == 0) {
            remove_First();
        } else {
            Node temp = get_index_element(index);
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            temp.next = null;
            temp.prev = null;
            length--;

        }
    }

}

public class doubly_linked_list {

    public static void main(String[] args) {
        Dll d = new Dll(7);
        d.append_list(8);
        d.append_list(9);
        d.append_list(10);
        d.print_list();
        d.remove_First();
        d.print_list();
        Node temp = d.get_index_element(0);
        System.out.println(temp.value);
        d.set(1, 19);
        d.print_list();
        d.insert(2, 99);
        d.print_list();
        d.remove(1);
        d.print_list();
    }

}
