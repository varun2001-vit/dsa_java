
package dsa;

import java.util.ArrayList;
import java.util.HashMap;

class graph_class
{
    HashMap<String,ArrayList<String>> adjlist= new HashMap<>();
     public void print_graph()
    {
        System.out.println(adjlist);
    }
    public boolean insert_vertex(String key)
    {
        if(adjlist.get(key)==null)
        {
             adjlist.put(key,new ArrayList<String>());//empty arraylist
             return true;
        }
       return false;
    }
    public boolean insert_edge(String key1,String key2)
    {
        if( adjlist.get(key1)!=null && adjlist.get(key2)!=null)
        {
            adjlist.get(key1).add(key2);
            adjlist.get(key2).add(key1);
            return true;
        }
        return false;
    }
    public boolean remove_edge(String key1,String key2)
    {
        if( adjlist.get(key1)!=null && adjlist.get(key2)!=null)
        {
            adjlist.get(key1).remove(key2);
            adjlist.get(key2).remove(key1);
            return true;
        }
        return false;
    }
    public boolean remove_vertex(String key)
    {
        if(adjlist.get(key)==null)return false;
        else
        {
            for ( String keys:adjlist.get(key))
            {
                adjlist.get(keys).remove(key);
            }
            adjlist.remove(key);
            return true;
        }
    }
    
    
   }

    



public class bd_graph {
    public static void main(String[] args) {
        graph_class a = new graph_class();
        a.insert_vertex("A");
        a.insert_vertex("B");
        a.insert_vertex("C");
        a.insert_edge("A","B");
        a.insert_edge("C", "A");
        a.insert_edge("C", "B");
        a.print_graph();
        a.remove_edge("A","B");
        a.print_graph();
        a.remove_vertex("C");
        a.print_graph();
    }
}
