package com.shsxt.leetcode.demoStack;

import java.util.Stack;

public class MyStack1 {
    private Stack<Integer>stackData;
    private Stack<Integer>stackMin;
    public MyStack1(){
        this.stackData=new Stack<>();
        this.stackMin=new Stack<>();

    }
    public void push(int newNum){
        if (this.stackMin.isEmpty()){
            this.stackMin.push(newNum);
        }else if (newNum<=this.getmin()){
            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }

    public int pop(){
        if (this.stackData.isEmpty()){
            throw new RuntimeException("Your stack is empty");
        }
        if (stackData.peek()==this.getmin()){
            stackMin.pop();

        }
        return  stackData.pop();
    }

    public int getmin(){
        if(this.stackMin.isEmpty()){
            throw new RuntimeException("YOUR stack is empty.");

        }return this.stackMin.peek();
    }

    public static void main(String[] args) {
        MyStack1 stack1=new MyStack1();
        stack1.push(12);
        stack1.push(3);
        stack1.push(6);
        System.out.println(stack1.getmin());
        stack1.pop();
        System.out.println(stack1.getmin());
        stack1.pop();
        System.out.println(stack1.getmin());
        stack1.pop();
        System.out.println(stack1.getmin());
    }

}
