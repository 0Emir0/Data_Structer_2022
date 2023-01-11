public class Main{

    public static void main(String[] args){
        Kuyruk kuyruk = new Kuyruk(3);
        kuyruk.enQueue(10);
        kuyruk.enQueue(20);
        kuyruk.enQueue(30);
        kuyruk.enQueue(40);
        kuyruk.deQueue();
        kuyruk.yazdir();

    }
}