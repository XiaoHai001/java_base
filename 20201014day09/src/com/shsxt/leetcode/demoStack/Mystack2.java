package com.shsxt.leetcode.demoStack;

import java.util.Stack;

public class Mystack2 {
    public static void main(String[] args) {
        Mystack2 stack1=new Mystack2();
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

    private Stack<Integer>stackData;
    private Stack<Integer>stackMin;

    public Mystack2() {
        this.stackData=new Stack<>();
        this.stackMin=new Stack<>();
    }

    public int getmin(){
        if (this.stackMin.isEmpty()){
            throw new RuntimeException("你的栈为空");
        }
        return this.stackMin.peek();
    }
    public void push(int e){
        if (e<=this.getmin())this.stackMin.push(e);
        stackData.push(e);
    }
    public int pop(){
        if (stackData.isEmpty()){
            throw new RuntimeException("你的栈为空！");
        }
        Integer peek = this.stackData.peek();
        if (peek==this.getmin())this.stackMin.pop();
        return peek;
    }
}
