public class Queue {
    private int rear;
    private int front;
    private int queue[] = new int[10];

    public Queue() {
        this.front = 0;
		this.rear = 4;
		queue[0] = 3;
		queue[1] = 6;
		queue[2] = 5;
		queue[3] = 2;
		queue[4] = 7;		
	}

    public void enQueue(){}
    
    // ketika queue hampir kosong, front dan rear di set ke -1
    // untuk pengaplikasian enQueue, mohon dicek apakah queue kosong atau tidak
    public int deQueue(){
        if(isEmpty()) {
            return -1;
        }
        else {
            int data = queue[front];
            if(this.front == this.rear) {
                this.front = -1;
                this.rear = -1;
            }
            else {
                // front tidak akan melebihi ukuran 10
                this.front = (this.front + 1)%10;
            }
            return data;
        }
    }
    
    public boolean isEmpty(){
        if(this.front == -1) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void isFull(){}

    public void peek(){}
    
    public void clear(){
        while(!this.isEmpty()) {
            this.deQueue();
        }
    }

    public void show(){
        if (isEmpty()) {
            System.out.println("Queue Kosong");
        } else {
            int ln = isFull() ? 9 : this.rear > this.front ? Math.abs(this.front - this.rear) + 1 : (11 - Math.abs(this.front - this.rear));
            System.out.println();
            for (int i = 1; i <= ln ; i++) {
                System.out.print("|‾‾‾‾‾|  ");
            }
            System.out.println();
            if (this.rear > this.front){
                for (int i = this.front; i <= this.rear-1; i++) {
                    System.out.printf("| %- 3d |——",queue[i]);
                }
                System.out.printf("| %- 3d |",queue[this.rear]);
            }else{
                for (int i = this.front; i <= 9; i++) {
                    System.out.printf("| %- 3d |——",queue[i]);
                }
                for (int i = 0; i < this.rear ; i++) {
                    System.out.printf("| %- 3d |——",queue[i]);
                }
                System.out.printf("| %- 3d |",queue[this.rear]);
            }
            System.out.println(); 
            for (int i = 1; i <= ln; i++) {
                System.out.print("|_____|  ");
            }
            System.out.println();
        }
		System.out.println();
	}

    public int getFront(){
        return this.front;
    }
    
    public int getRear(){
        return this.rear;
    }
    
    public int[] getQueue(){
        return this.queue;
    }
}
