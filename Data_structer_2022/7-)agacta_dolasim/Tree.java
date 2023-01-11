public class Tree {
    Node root;

    public Tree(){
        root=null;
    }

    Node newNode(int data){
        root=new Node(data);
        return root;
    }
    Node insert(Node root,int data){
        if(root!=null){
            if(data<root.data)
                root.left=insert(root.left,data);
            else
            root.right=insert(root.right,data);
        }
        else 
            root=newNode(data);
        return root;
    }

    void pre_order(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            pre_order(root.left);
            pre_order(root.right);
        }
    }
    void in_order(Node root){
        if(root!=null){
            in_order(root.left);
            System.out.print(root.data+" ");
            in_order(root.right);
        }
    }
    void post_order(Node root){
        if(root!=null){
            post_order(root.left);
            post_order(root.right);
            System.out.print(root.data+" ");
        }
    }
}
