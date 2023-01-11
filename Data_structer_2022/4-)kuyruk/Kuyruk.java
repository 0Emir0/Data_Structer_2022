public class Kuyruk {
    Node front;
    Node rear;
    int counter;
    int size;
    int data;
    public Kuyruk(int size){
        this.size=size;
        counter=0;
        front=null;
        rear=null;
    }

    void enQueue(int data){
        if(isFull()){
            System.out.println("Kuyruk dolu, ekleme yapılamadı.");

        }
        else{
            Node eleman=new Node(data);
            if(isEmpty()){
                front=eleman;
                rear=eleman;
                System.out.println(data + " Kuyruğa eklendi");
            }
            else{
                rear.next=eleman;
                rear=rear.next;
                System.out.println(data + " Kuyruğa eklendi");
            }
            counter++;
        }
    }

    void deQueue(){
        if(isEmpty()){
            System.out.println("Kuyruk boş.");
        }
        else{
            front= front.next;
            System.out.println(front.data + "  -  Kuyruktan silindi.");
        }
    }

    boolean isEmpty(){
        return counter==0;
    }

    boolean isFull(){
        return counter==size;
    }

    void yazdir(){
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data + "<-");
            temp=temp.next;

        }
    }
}

