package chapter04.queues;


public class LinkedQueue<T>
{
   protected PersonNode<T> front;
   protected PersonNode<T> rear;
   protected int numElements;
   
   public LinkedQueue()
   {
      front = null;
      rear = null;
      numElements = 0;
   }

   public void enqueue(T fName, T lName, T sNum)
   {
      personNode<T> newNode = new PersonNode<>(fName, lName, sNum);

      if (this.rear == null) {
         front = newNode;
      }



   }


   public T dequeue()
   {
      //Complete this method as required in the homework instructions.




   }
   
   public void peekFront()
   {
      //Complete this method as required in the homework instructions.



   }

   public boolean contains(T lookFor)
   {
      //Complete this method as required in the homework instructions.



   }

   public void display()
   {
      //Complete this method as required in the homework instructions.



   }

   public int size()
   {
      return numElements;
   }

   public boolean isFull()
   {
      return false;
   }

   public boolean isEmpty()
   {
      return numElements == 0;
   }
}