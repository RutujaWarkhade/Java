import java.util.*;
class Node{
    int data;
    Node left;
    Node right;

    Node(int x)
    {
        data = x;
        left = null;
        right = null;
    }
}


public class BinaryTree{

    //insert left

        public static void insertL(Node root, Node newNode)
        {
            if(root.left == null)
            {
                root.left = newNode;
                return;
            }
            insertL(root.left, newNode);  
        }

    //insert right

        public static void insertR(Node root, Node newNode)
        {
            if(root.right == null)
            {
                root.right = newNode;
                return;
            }
            insertR(root.right, newNode);
        }

    //preorder display

    public static void preorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    //Inorder display

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

    //postorder display

    public static void postorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data);
    }

    //main function
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        int t;
        do{
            System.out.println("1.Insert data\n2.Display\nenter your choice");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("enter data:");
                    int val = sc.nextInt();
                    Node newNode = new Node(val);
                    if(root==null)
                    {
                        root = newNode;
                    }
                    else
                    {
                        System.out.println("enter your choice left (L / l) or rigth (R / r) :");
                        char choice = sc.next().charAt(0);
                        if(choice == 'l' || choice == 'L')
                        {
                            insertL(root, newNode);
                        }
                        else if(choice == 'r' || choice == 'R')
                        {
                            insertR(root, newNode);
                        }
                        else
                        {
                            System.out.println("invalid choice");
                        }

                    }
                    break;
                    case 2:
                        System.out.println("Elements by preorder:");
                        preorder(root);
                        System.out.println();
                        System.out.println("Elements by inorder:");
                        inorder(root);
                        System.out.println();
                        System.out.println("Elements by postorder:");
                        postorder(root);
                        System.out.println();
                        break;

                    default:
                        System.out.println("wrong choice");
                        break;
            }
            System.out.println("if you want continue press 1 :");
            t = sc.nextInt();
        }while(t==1);
    }






}









    