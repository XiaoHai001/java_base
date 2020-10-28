package com.shsxt.leetcode.demoStack;

import java.util.Stack;

public class MyQueue {
    public static void main(String[] args) {
        MyQueue myQueue=new MyQueue();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        System.out.println(myQueue.poll());
        System.out.println(myQueue.peek());

    }
    private Stack<Integer>stack1;
    private Stack<Integer>stack2;
    public MyQueue(){
        this.stack1=new Stack<>();
        this.stack2=new Stack<>();
    }
    public void add(int e){
        this.stack1.push(e);

    }
    public int poll(){
        if (stack1.isEmpty()){
            throw new RuntimeException("队列为空");
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        Integer pop = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return pop;
    }
    public int peek(){
        if (stack1.isEmpty()){
            throw new RuntimeException("队列为空");
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        Integer peek = stack2.peek();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return peek;
    }

}
