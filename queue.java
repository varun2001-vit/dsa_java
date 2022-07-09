/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

class Node_q {

    int value;
    Node_q next;

    Node_q(int value) {
        this.value = value;
    }
}

class queue_class {

    Node_q first, last;
    int lenght;

    queue_class(int value) {
        Node_q newnode = new Node_q(value);
        first = newnode;
        last = newnode;
        lenght = lenght + 1;
    }

    void print_queue() {
        Node_q temp = first;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println("");
    }

    void enqueue(int value) {

        Node_q newnode = new Node_q(value);
        if (lenght == 0) {
            first = last = newnode;
        } else {
            last.next = newnode;
            last = newnode;
        }
        lenght++;
    }

    public void dequeue() {
        if (lenght == 0) {
            System.out.println("empty list");
        }else if(lenght==1)
        {
            first=last=null;
        }
        else {
            Node_q temp = first;
            first = first.next;
            temp.next = null;
            lenght--;

        }

    }
}

public class queue {

    public static void main(String[] args) {
        queue_class q = new queue_class(7);
        q.print_queue();
        q.enqueue(8);
        q.enqueue(9);
        q.print_queue();
        q.dequeue();
        q.print_queue();
    }

}
