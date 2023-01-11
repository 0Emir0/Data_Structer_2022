public class Stack {
    

    int liste[];
    int size;
    int index;
    public Stack(int size){
        this.size = size;
        liste=new int[size];
        index=-1;
    }

    void push(int data){
        if(isFull()){
            System.out.println("Stack dolu!");
        }
        else{
            index++;
            liste[index]=data;
            System.out.println(liste[index] + " - Stack yapısına eklendi.");
        }

    }

    int pop(){
        if(isEmpty()){
            System.out.println("Dizi boş!");
            return -1;
        }
        else{
            
            return liste[index--];
        }
    }
    boolean isFull(){
        return (index == size-1);
    }
    boolean isEmpty(){
        return (index==-1 );
    }


}
