package bfs;
import java.util.*;

public class BFS {
static class Node
{
    char key;
    Vector<Node > child_node = new Vector<>();
};
 
static Node newNode(char key)
{
    Node temp = new Node();
    temp.key = key;
    return temp;
}
 
static void BFS_Node_Visit(Node root)
{
    if (root == null)
        return;
 
    LinkedList<Node > q = new LinkedList<>();
    
    q.add(root);
    while (!q.isEmpty())
    {
        int n = q.size();
 
        while (n > 0)
        {
            Node p = q.peek();
            q.remove();
            System.out.print(p.key + " ");
            for (int i = 0; i < p.child_node.size(); i++)
                q.add(p.child_node.get(i));
            n--;
        }
         
    }
}
 
public static void main(String[] args)
{

    Node root = newNode('A');
    (root.child_node).add(newNode('B'));
    (root.child_node).add(newNode('C'));
    (root.child_node).add(newNode('D'));
    (root.child_node.get(0).child_node).add(newNode('E'));
    (root.child_node.get(1).child_node).add(newNode('F'));
    (root.child_node.get(1).child_node).add(newNode('G'));
    (root.child_node.get(2).child_node).add(newNode('H'));
    (root.child_node.get(2).child_node.get(0).child_node).add(newNode('I'));
 
    System.out.println("BFS Tree is: ");
    BFS_Node_Visit(root);
    System.out.println("");
}
}
