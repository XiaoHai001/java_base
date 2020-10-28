package com.shsxt.demoLinkedList;

public class MyLinkedList<E> {
    private int size = 0;
    private MyNode<E> first;
    private MyNode<E> last;

    public MyLinkedList() {

    }

    public int size() {
        return this.size;
    }

    public boolean add(E e) {
        //备份最后一个节点
        MyNode<E> l = last;
        //创建一个包含传入数据的结点，并将前驱指向last
        MyNode newNode = new MyNode(l, e, null);
        //将last指向新的结点
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        this.size++;
        return true;
    }

    public E remove(int idx) {
        //判断idx是否合法
        if (idx < 0 || idx > this.size) {
            throw new IllegalArgumentException("illegal num" + idx);
        }
        MyNode<E> temp = this.first;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        MyNode<E> pre = temp.prev;
        MyNode<E> nex = temp.next;
        //没前驱
        if (pre==null) {
            this.first=nex;
        }else{
            pre.next=nex;
        }
        //没后驱
        if (nex==null) {
            this.last=pre;
        }else{
            nex.prev=pre;
            temp.next=null;//垃圾回收
        }
        this.size--;

        return temp.item;
    }

    //
    public E set(int idx,E e){
        MyNode<E> temp=this.first;
        for (int i = 0; i <idx ; i++) {
            temp=temp.next;
        }
        E result=temp.item;
        temp.item=e;
        return result;
    }
    private static class MyNode<E> {
        E item;
        MyNode<E> next;
        MyNode<E> prev;

        MyNode(MyNode<E> prev, E element, MyNode<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

}
