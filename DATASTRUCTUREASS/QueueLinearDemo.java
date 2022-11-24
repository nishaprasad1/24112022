/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amart
 */
public class QueueLinearDemo 
{
     int front,rear,MaxSize,q[];
     
     void createQueue(int size)
     {
         front=0;
         rear=-1;
         MaxSize=size;
         q=new int[MaxSize];
     }
      void enqueue(int e)
      {
          rear++;
          q[rear]=e;
          //q[++rear]=e
      }
  
  boolean isFull()
  {
      if(rear==MaxSize-1)
          return true;
      else
          return false;
  }
  int dequeue()
  {
      int temp=q[front];
      front++;
      return(temp);
  }
  boolean isEmpty()
  {
      if(front>rear)
          return true;
      else
          return false;
  }
  
  void printQueue()
  {
      for(int i=front   ;i  <=rear   ; i++)
          System.out.println(q[i]);
  }
  
}







