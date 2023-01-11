public class Listeyapisi {
    
    Node head=null;
    Node tail=null;

    void eleman_ekle(int x){
        Node eleman = new Node();
        eleman.data=x;
        eleman.next=null;

        if(head==null){
            head=eleman;
            tail=eleman;
            System.out.println("İlk Düğüm oluşturuldu. -> " + eleman.data );
        }
        else{
            tail.next = eleman;
            tail=eleman;
            System.out.println("Listenin sonunda yeni bir düğüm oluşturuldu. -> " + eleman.data);
        }

    }

    void yazdir(){
        if(head==null){
            System.out.println("Listede düğüm yok.");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }

}
