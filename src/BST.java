public class BST {
    private Node root=null;
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public Node insert(Node root, int data){
        Node newNode = new Node(data);
        if(root==null){
            root= newNode;
            return root;
        }else if (data<=root.data){
            root.left= insert(root.left,data);
        }else {
            root.right=insert(root.right,data);
    }
        return  root;
}
public boolean Search(Node root, int data){
        if(root==null){
            return false;
        }else if(root.data==data){

            return true;
        }else if(data <= root.data){
            return Search(root.left,data);
        }else {
            return Search(root.right,data);
        }


}
    void inorder()
    {
        inorderRec(root);
    }

    // A utility function to
    // do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
       BST node = new BST();

     node.root=node.insert(node.root, 50);
        node.root=node.insert(node.root, 30);
        node.root=node.insert(node.root, 20);


        if(node.Search(node.root, 96)==true){
         System.out.println("found");
     }else{
         System.out.println("not found");
     }
     node.inorder();


    }

}
