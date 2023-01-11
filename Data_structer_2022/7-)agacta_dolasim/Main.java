public class Main{
    public static void main(String[]args){
        Tree agac = new Tree();

        agac.root=agac.insert(agac.root,25);
        agac.root=agac.insert(agac.root,14);
        agac.root=agac.insert(agac.root,7);
        agac.root=agac.insert(agac.root,5);
        agac.root=agac.insert(agac.root,10);
        agac.root=agac.insert(agac.root,40);
        agac.root=agac.insert(agac.root,50);

        System.out.print("preOrder: ");
        agac.pre_order(agac.root);

        System.out.print("\ninOrder:  ");
        agac.in_order(agac.root);

        System.out.print("\npostOrder:");
        agac.post_order(agac.root);
    }
}