public class Queue {
    private int rear;
    private int queue[] = new int[10];

    public Queue() {
		this.rear = 4;
		queue[0] = 3;
		queue[1] = 6;
		queue[2] = 5;
		queue[3] = 2;
		queue[4] = 70;
	}

    public void enQueue(){}
    
    public void deQueue(){}
    
    public void isEmpty(){}
    
    public void isFull(){}
    
    public void clear(){}

    public void show(){
		System.out.println();
        for (int i = 0; i < this.rear; i++) {
            System.out.print("|‾‾‾‾‾|  ");
        }
        System.out.println();
		for (int i = 0; i < this.rear-1; i++) {
			System.out.printf("| %- 3d |——",queue[i]);
		}
        System.out.printf("| %- 3d |",queue[this.rear-1]);
        System.out.println();
        for (int i = 0; i < this.rear; i++) {
            System.out.print("|_____|  ");
        }
		System.out.println();
		System.out.println();
	}
    
    public int getRear(){
        return this.rear;
    }
    
    public int[] getQueue(){
        return this.queue;
    }
}
