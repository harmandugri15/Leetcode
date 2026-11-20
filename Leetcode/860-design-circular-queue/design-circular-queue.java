class MyCircularQueue {
    public int[] arr;
    public int size;
    public int front;
    public int rear;
    public int capacity;

    public MyCircularQueue(int k) {
        arr=new int[k];
        this.capacity=k;
        this.front=0;
        this.rear=0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        else{
            arr[rear]=value;
            rear=(rear+1) % capacity;
            size++;
            return true;
        }
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        else{
            front=(front+1) % capacity;
            size--;
            return true;
        }
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        else{
            return arr[ ((rear-1+capacity) % capacity)];
        }
    }
    
    public boolean isEmpty() {
        if(size==0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isFull() {
        if(size==capacity){
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */