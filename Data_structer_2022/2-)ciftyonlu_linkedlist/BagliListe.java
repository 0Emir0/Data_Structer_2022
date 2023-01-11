public class BagliListe {

    Node head=null;
    Node tail=null;

    void basa_ekle(int data){
        Node eleman=new Node(data);

        if(head==null){
            head=eleman;
            tail=eleman;
        }
        else{
            eleman.next=head;
            head.prev=eleman;
            head=eleman;
        }
    }
    
    void sona_ekle(int data){
        Node eleman=new Node(data);

        if(head==null){
            head=eleman;
            tail=eleman;
        }
        else{
            tail.next=eleman;
            eleman.prev=tail;
            tail=eleman;
        }
    }
    
    void yazdir(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data + "Düğümü oluşturuldu.");
            temp=temp.next;
        }
    }
}
