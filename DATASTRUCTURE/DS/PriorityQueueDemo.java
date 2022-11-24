/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amart
 */
import java.util.*;
public class PriorityQueueDemo 
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
           for(int i=front;i<rear;i++)
           {
               for(int j=front;j<rear;j++)
               {
                   if(q[j]  q[j+1])
                   {
                       int t=q[j];
                       q[j]=q[j+1];
                       q[j+1]=t;
                   }
               }
           }
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
      
  public static void main(String args[])
  {
      int ch,e;
      StackDemo obj=new StackDemo();
      Scanner in=new Scanner(System.in);
      System.out.println("Enter size of stack:");
      int s=in.nextInt();
      obj.createStack(s);
      do
      {
           System.out.println("1.push\n2.pop\n3.peek\n4.print\n0.exit");
           ch=in.nextInt();
           switch(ch)
           {
               case 1:
                   if(!obj.isFull())//is not full
                   {
                        System.out.println("Enter Data:");
                        e=in.nextInt();
                        obj.push(e);
                        System.out.println("Pushed");
                   }
                   else
                        System.out.println("Stack Full");
                   break;
                   
                case 2:
                   if(!obj.isEmpty())//is not empty
                   {
                        e=obj.pop();
                        System.out.println("Poped:"+e);
                   }
                   else
                        System.out.println("Stack Empty");
                   break;
                   
                 case 3:
                   if(!obj.isEmpty())//is not empty
                   {
                        e=obj.peek();
                        System.out.println("@ peek:"+e);
                   }
                   else
                        System.out.println("Stack Empty");
                   break;  
                
                 case 4:
                   if(!obj.isEmpty())//is not empty
                   {
                        System.out.println("Stack has:");
                        obj.printStack();
                   }
                   else
                        System.out.println("Stack Empty");
                   break;  
                 case 0:
                        System.out.println("Exiting ");
                        break;
                 default:
                        System.out.println("Wrong option selected");
                        break;
           }
      }while(ch!=0);
      }
      
          
  }
