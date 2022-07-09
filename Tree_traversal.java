package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class treeTraversal {

    Node_bt root;

    public boolean insert_node(int value) {
        Node_bt newnode = new Node_bt(value);
        if (root == null) {
            root = newnode;
            return true;
        }
        Node_bt temp = root;

        while (true) {
            if (temp.value == newnode.value) {
                return false;
            } else if (newnode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newnode;
                    return true;
                }
                temp = temp.left;

            } else {
                if (temp.right == null) {
                    temp.right = newnode;
                    return true;
                }
                temp = temp.right;
            }
        }

    }

    public ArrayList<Integer> bfs_search() {
        ArrayList<Integer> results = new ArrayList<>();
        Queue<Node_bt> queue = new LinkedList<>();
        Node_bt currentNode = root;
        queue.add(root);
        while (queue.size() > 0) {
            Node_bt removed = queue.remove();
            results.add(removed.value);
            if (removed.left != null) {
                queue.add(removed.left);
            }
            if (removed.right != null) {
                queue.add(removed.right);
            }

        }
        return results;
    }

    public ArrayList<Integer> dfs_preorder() {
        ArrayList<Integer> results = new ArrayList<>();
        class Traverse {

            Traverse(Node_bt node) {
                results.add(node.value);
                if (node.left != null) {
                    new Traverse(node.left);
                }
                if (node.right != null) {
                    new Traverse(node.right);
                }
            }

        }
        new Traverse(root);
        return results;
    }

    public ArrayList<Integer> dfs_postorder() {
        ArrayList<Integer> results = new ArrayList<>();
        class Traverse {

            Traverse(Node_bt node) {

                if (node.left != null) {
                    new Traverse(node.left);
                }
                if (node.right != null) {
                    new Traverse(node.right);
                }
                results.add(node.value);
            }

        }
        new Traverse(root);
        return results;
    }
    public ArrayList<Integer> dfs_inorder() {
        ArrayList<Integer> results = new ArrayList<>();
        class Traverse {

            Traverse(Node_bt node) {

                if (node.left != null) {
                    new Traverse(node.left);
                }
                results.add(node.value);
                if (node.right != null) {
                    new Traverse(node.right);
                }
                
            }

        }
        new Traverse(root);
        return results;
    }
}

    public class Tree_traversal {

        public static void main(String[] args) {
            treeTraversal btree = new treeTraversal();
            btree.insert_node(47);
            btree.insert_node(21);
            btree.insert_node(76);
            btree.insert_node(18);
            btree.insert_node(27);
            btree.insert_node(52);
            btree.insert_node(82);
            System.out.println("BFS: " + btree.bfs_search());
            System.out.println("DFS(Pre): " +btree.dfs_preorder());
            System.out.println("DFS(Post):" + btree.dfs_postorder());
            System.out.println("DFS(in): " + btree.dfs_inorder());

        }
    }
