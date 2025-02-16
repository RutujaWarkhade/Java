import java.util.*;
public class BST{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;

        }
    }

    //insert data
    public static Node insert(Node root, int val)
    {
        if(root == null)
        {
            root = new Node(val);
            return root;
        }
        //left subtree
        if(val<root.data)
        {
            root.left = insert(root.left, val);
        }
        //right subtree
        else
        {
            root.right = insert(root.right, val);
        }
        return root;
    }

    //display by inorder
    public static void inorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //search key
    public static boolean search(Node root, int key)
    {
        if(root == null)
        {
            return false;
        }
        if(root.data == key)
        {
            return true;
        }
        else if(root.data>key)
        {
            return search(root.left, key);
        }
        else
        {
            return search(root.right, key);
        }
    }


    /*//delete Node
    public static Node delete(Node root, int val)
    {
        if(root.data>val)
        {
            root.left = delete(root.left, val);
        }
        else if(root.data<val)
        {
            root.right = delete(root.right, val);
        }
        else
        {
            //root.data = val
            //case 1
            if(root.left == null && root.right == null)
            {
                return null;
            }
            //case 2
            if(root.right == null)
            {
                return root.left;
            }
            else if(root.left == null)
            {
                return root.right;
            }
            //case 3
                Node IS = inorderSuccessor(root.right);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root)
        {
            while(root.left != null)
            {
                root = root.left;
            }
            return root;
        }
*/


    public static Node delete(Node root, int val)
    {
        if(root.data > val)
        {
            root.left = delete(root.left, val);
        }
        else if(root.data < val)
        {
            root.right = delete(root.right, val);
        }
        else
        {
            //root.data = val
            //case 1: no child
            if(root.left==null && root.right==null)
            {
                return null;
            }
            //case 2: 1 child
            if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }
            //case 3: 2 child
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;

    }

    public static Node inorderSuccessor(Node root)
    {
        while(root.left != null)
        {
            root = root.left;
        }
        return root;
    }


    //Print in range nodes
    public static void printInRange(Node root, int x, int y)
    {
        if(root == null)
        {
            return;
        }
        if(root.data>=x && root.data<=y)
        {
            printInRange(root.left, x, y);
            System.out.print(root.data+" ");
            printInRange(root.right, x, y);
        }
        else if(root.data>=y)
        {
            printInRange(root.left, x, y);
        }
        else
        {
            printInRange(root.right, x, y);
        }
    }

    //print root to leaf node paths

    public static void printPath(ArrayList<Integer>path)
    {
        for(int i=0;i<path.size();i++)
        {
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    public static void printRoot2leaf(Node root, ArrayList<Integer>path)
    {
        if(root == null)
        {
            return;
        }
        path.add(root.data);
        //leaf
        if(root.left==null && root.right==null)
        {
            printPath(path);
        }
        else//non-leaf
        {
            printRoot2leaf(root.left, path);
            printRoot2leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }

    public static void main(String args[])
    {
        Node root = null;
        int values[] = {8,5,3,6,10,11,14};

        for(int i=0;i<values.length;i++)
        {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        if(search(root, 3))
        {
            System.out.println("found");
        }
        else
        {
            System.out.println("not found");
        }

        //delete(root, 4);
        //inorder(root);

        printInRange(root, 6,10);
        System.out.println();

        printRoot2leaf(root, new ArrayList<>());
    }
}