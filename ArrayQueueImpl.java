public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        if (arr.length == 0) return -1;
        return arr[front];
        //while
//implement
    }

    public void enqueue(int obj) {
        if (front == arr.length) resize();
        int[] tmp = new int[arr.length];
        tmp[0] = obj;
        System.arraycopy(arr, 0, tmp, 1, arr.length - 1);
        arr = tmp;
        ++front;
        //front = 0;
        //while (a)
//implement
    }

    public int dequeue() {
        if (arr.length >= 1) {
            --front;
            return arr[front];
        }
        return -1;
//implement
    }

    public boolean isEmpty() {
        return (front < 0);
    }

    public int size() {
        return front+1;
    }

    private void resize() {
        int[] tmp = new int[arr.length* 2];
        System.arraycopy(arr, 0, tmp, 0, size());
        arr = tmp;
//implement
    }

    public static void main(String[] args) {
        ArrayQueueImpl aq = new ArrayQueueImpl();
        System.out.println("Size of my array: " + aq.size());
        System.out.println("Is the queue empty?  " + aq.isEmpty());
        aq.enqueue(1);
        System.out.println("Is the queue empty?  " + aq.isEmpty());
        aq.enqueue(2);
        aq.enqueue(3);
        aq.enqueue(4);
        aq.enqueue(5);
        System.out.println("Size of my array: " + aq.size());
        System.out.println("Element to dequeue, i.e. 1st element: " + aq.peek());
        aq.dequeue();
        System.out.println("Size of my array: " + aq.size());
        System.out.println("Element to dequeue, i.e. 1st element: " + aq.peek());


    }

}
