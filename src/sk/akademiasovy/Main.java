package sk.akademiasovy;

public class Main
{


    public static void main(String[] args)
    {
        Node root = null;
        int i;
        Node newNode;
        int [] array={47,20,73,41,18,59,33,60,15,96,44,79,6,80,9,34,5,30,77,49};
        for(int cislo:array)
        {

            newNode=new Node(cislo);
            if(root == null) {
                root = newNode;
            }
            else
            addNewNodeToTree(root,newNode);
        }
        System.out.print("IN ORDER: ");
        print_inOrder(root);
        System.out.println();
        System.out.print("PRE ORDER: ");
        print_preOrder(root);
        System.out.println();
        System.out.print("POST ORDER: ");
        print_postOrder(root);

    }

    private static void addNewNodeToTree(Node root, Node newNode)
    {
        if(root == null)
        {
            root = newNode;
            return;
        }
        if(newNode.getValue() <= root.getValue())
        {
            if(root.getLeft() == null)
            {
                root.setLeft(newNode);
                return;
            }
            else
            {
                addNewNodeToTree(root.getLeft(),newNode);
                return;
            }

        }
        else
        {
            if(root.getRight() == null)
            {
                root.setRight(newNode);
                return;
            }
            else
            {
                addNewNodeToTree(root.getRight(),newNode);
            }

        }

    }

    public static void print_inOrder(Node root)
    {
        if(root.getLeft()!= null)
        {
            print_inOrder(root.getLeft());
        }
        System.out.print(root.getValue()+" ");

        if(root.getRight()!= null)
        {
            print_inOrder(root.getRight());
        }



    }

    public static void print_preOrder(Node root)
    {
        System.out.print(root.getValue()+" ");
        if(root.getLeft()!=null)
            print_preOrder(root.getLeft());
        if(root.getRight()!=null)
            print_preOrder(root.getRight());



    }

    public static void print_postOrder(Node root)
    {

        if(root.getLeft()!= null)
        {
            print_postOrder(root.getLeft());
            ;
        }

        if(root.getRight()!= null)
        {
            print_postOrder(root.getRight());
        }

        System.out.print(root.getValue()+" ");



    }
}
