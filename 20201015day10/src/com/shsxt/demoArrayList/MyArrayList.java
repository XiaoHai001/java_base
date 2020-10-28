package com.shsxt.demoArrayList;

public class MyArrayList<T> {
    private static final int DEFAULT_CAPACITY = 2;  //默认给的长度
    private int size=0;               //存放元素的个数
    private Object[] elementData={};      //存放数据的地方

    public MyArrayList() {
        this.elementData = new Object[DEFAULT_CAPACITY];

    }

    public MyArrayList(int initialCapacity) {
        //数据合法性的判断
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Illegal capacity" + initialCapacity);
        }
        this.elementData = new Object[initialCapacity];
    }

    public int size() {
        return this.size;
    }


    //添加元素
    public boolean add(T t) {
        //确保容量能放下元素
        ensureCapacity();
        this.elementData[size]=t;
        this.size++;
        return true;
    }
    //加元素到某个位置
    public boolean add(int idx,T t) {
        isCorrect(idx);
        ensureCapacity();
        System.arraycopy(this.elementData,idx,this.elementData,idx+1,this.size-idx);
        this.elementData[idx]=t;
        this.size++;
        return true;
    }
    private void isCorrect(int idx){
        //idx合法判断
        if (idx>this.size||idx<0){
            throw new IllegalArgumentException("Illegal num"+idx);
        }
    }
    //查某个坐标的元素
    public T get(int idx){
        isCorrect(idx);
        return (T)this.elementData[idx];
    }
    //查元素的坐标
    public int indexOf(T t){
        for (int i = 0; i < this.elementData.length; i++) {
            if (t==this.elementData[i]) {
                return i;
            }
        }
        return -1;
    }
    //根据下标删除
    public T remove(int idx){
        isCorrect(idx);
        T result= (T) this.elementData[idx];
        System.arraycopy(this.elementData,idx+1,this.elementData,idx,this.size-idx-1);
        this.size--;
        return result;
    }
    //根据元素删除
    public boolean remove(T t){
        for (int i = 0; i < this.elementData.length; i++) {
            if (t==this.elementData[i]) {
                System.arraycopy(this.elementData,i+1,this.elementData,i,this.size-i-i);
                this.size--;
                return true;
            }
        }
        return false;
    }



    private void ensureCapacity(){
        //判断是否需要扩容
        if (this.size + 1 > this.elementData.length) {//需要扩容
            Object[] newArray = new Object[this.size + (this.size >> 1)];
            System.arraycopy(this.elementData,0,newArray,0,this.size);
            this.elementData=newArray;
        }
    }
}
