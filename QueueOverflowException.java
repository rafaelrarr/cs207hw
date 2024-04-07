package chapter04.queues;

public class QueueOverflowException extends RuntimeException
{
   public QueueOverflowException()
   {
      super();
   }

   public QueueOverflowException(String message)
   {
      super(message);
   }
}