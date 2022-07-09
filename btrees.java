
package dsa;
class Node_bt
{
    int value;
    Node_bt left,right;

    public Node_bt(int value) {
        this.value = value;
    }
    
}
class bt_class
{
    Node_bt root;
    public boolean insert_node(int value)
    {
        Node_bt newnode= new Node_bt(value);
        if(root==null)
        {
            root=newnode;
            return true;
        }
        Node_bt temp=root;
        
        while(true)
        {
            if(temp.value==newnode.value)
                return false;
            else if(newnode.value<temp.value)
            {
                if (temp.left==null)
                {
                    temp.left=newnode;
                    return true;
                }
                temp=temp.left;
                
            }
            else
            {
                if (temp.right==null)
                {
                    temp.right=newnode;
                    return true;
                }
                temp=temp.right;
            }
        }
        
    }
    public boolean contains(int value)
    {
       Node_bt temp=root;
       while(temp!=null)
       {
           if(value<temp.value)
           {
               temp=temp.left;
           }
           else if(value>temp.value)
           {
               temp=temp.right;
           }
           else if(value==temp.value)
           {
               return true;
           }
           
       }
       return false;
    }
}

public class btrees {
    public static void main(String[] args) {
        bt_class bt= new bt_class();
       boolean b=bt.insert_node(2);
        System.out.println(b);
        bt.insert_node(3);
        bt.insert_node(1);
        bt.insert_node(5);
        bt.insert_node(6);
        bt.insert_node(4);
        System.out.println(bt.root.value);
        System.out.println(bt.root.left.value);
        System.out.println(bt.root.right.value);
        
    }
    
}
