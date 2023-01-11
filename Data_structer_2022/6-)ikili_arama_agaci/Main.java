public class Main{
    public static void main(String[]args){
        BSTree tree=new BSTree();
        tree.root=tree.insert(tree.root,10);
        tree.root=tree.insert(tree.root,15);
        tree.root=tree.insert(tree.root,8);
        tree.root=tree.insert(tree.root,20);
        tree.root=tree.insert(tree.root,4);
        tree.root=tree.insert(tree.root,12);

        System.out.println("Kök : "+tree.root.data);
        System.out.println("Kökün sağı : "+tree.root.right.data);
        System.out.println("Kökün solu : "+tree.root.left.data);
    }
}