package com.BK;

import java.io.*;
import java.lang.*;
import java.util.Scanner;

/*THIS PROGRAM WRITTEN FOR CS3310 AT WESTERN MICHIGAN UNIVERSITY BY KENNETH JAMES RIVARD
* THE MAIN IDEA OF THE PROGRAM IS TO IMPLEMENT STACKS AND QUEUES USING JAVA GENERICS
* FOR STACKS, A MINIMUM VALUE IS RETURNED IN O(1) TIME USING TWO STACKS
* STACKS AND QUEUES WORK ON ALL JAVA GENERIC TYPES
* FOR FILE I/O, AS PER THE INSTRUCTOR, THE FILE I/O TEST FOR STACKS AND QUEUES CAN BE IMPLEMENTED USING STRINGS ONLY
* ALL COMMENTED OUT CODE IN MAIN METHOD IS FOR TESTING PURPOSES TO SHOW THE FUNCTIONALITY OF THE STACKS AND QUEUES
* PROJECT SUBMITTED ON OCTOBER 18TH, 2016*/

public class Main<T extends Comparable> {

    public static void main(String[] args) throws IOException {

        /*stacks used for finding minimum value*/
        Stack stackMin1 = new Stack();
        Stack stackMin2 = new Stack();

        /*stacks used for testing Stack implementation*/
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        /*queues used for testing Queue implementation*/
        Queue queue1 = new Queue();
        Queue queue2 = new Queue();

        /*MINIMUM VALUE TEST FROM FILE*/
        System.out.println("READING FILE FOR MINIMUM VALUE TEST");
        Scanner minTest = new Scanner(new File("TestForMinVlue.txt"));
        while(minTest.hasNextInt()) {
            if(minTest.nextInt() < 2147483647) {
                stackMin1.push(minTest.nextInt());
                stackMin2.push(stackMin1.pop());
            }
            stackMin1.push(minTest.nextInt());
        }
        stackMin1.displayStack();
        stackMin2.displayStack();
        System.out.println("MIN VALUE: " + stackMin2.pop());

        System.out.println();
        System.out.println("========================================================================================");
        System.out.println();

        /*STACK AND QUEUE TEST FROM FILE*/
        System.out.println("READING FILE FOR STACK TEST");
        Scanner sTest = new Scanner(new File("TestForStackAndQueue.txt"));

        while(sTest.hasNextLine()){
            stack1.push(sTest.next());
            stack2.push(stack1.pop());
        }
        System.out.println("=================STACK 2 (\"Queue\")====================");
        stack2.displayStack();

        System.out.println("READING FILE FOR QUEUE TEST");
        Scanner qTest = new Scanner(new File("TestForStackAndQueue.txt"));
        while(qTest.hasNextLine()) {
            queue1.enqueue(qTest.next());
            queue2.enqueue(queue1.dequeue());
        }
        System.out.println("=================Queue 2 (\"Stack\")====================");
        queue2.displayQueue();



/*
        */
/* BELOW IS FOR TESTING PURPOSES*/
/*
        Stack stack1Test = new Stack();
        Stack stack2Test = new Stack();

        Queue queue1Test = new Queue();  //only prints 2 elements but enqueue() and dequeue() work
        Queue queue2Test = new Queue();  //only prints 2 elements but enqueue() and dequeue() work


        */
/*first stack to demonstrate that the push() and pop() methods work*//*

        System.out.println("STACK 1");
        stack1Test.push("I");
        stack1Test.push("Come");
        stack1Test.push("From");
        stack1Test.push("WMU");
        stack1Test.push("!");
        stack1Test.displayStack();
        stack1Test.pop();
        stack1Test.displayStack();



        */
/*second stack to implement the functionality of a queue with 2 stacks*//*

        System.out.println("STACK 2/QUEUE");
        stack2Test.push(stack1Test.pop());
        stack2Test.push(stack1Test.pop());
        stack2Test.push(stack1Test.pop());
        stack2Test.push(stack1Test.pop());
        stack2Test.displayStack();


        System.out.println("--------------------------------------------------------------------");
        System.out.println();


        */
/*first queue to demonstrate that the enqueue() and dequeue() methods work *//*

        System.out.println("QUEUE 1");
        queue1Test.enqueue("I");
        queue1Test.enqueue("Come");
        queue1Test.enqueue("From");
        queue1Test.enqueue("WMU");
        queue1Test.enqueue("!");
        queue1Test.displayQueue();
        queue1Test.dequeue();
        queue1Test.displayQueue();
        System.out.println();


*/
/*second queue to implement the functionality of a stack with 2 queues*//*


        System.out.println("QUEUE 2/STACK");
        queue2Test.enqueue(queue1Test.dequeue());
        queue2Test.enqueue(queue1Test.dequeue());
        queue2Test.enqueue(queue1Test.dequeue());
        queue2Test.enqueue(queue1Test.dequeue());
        queue2Test.enqueue(queue1Test.dequeue());
        queue2Test.displayQueue();
*/


    }//end main

}//end class Main