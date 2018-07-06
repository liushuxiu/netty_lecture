package com.test;

import sun.applet.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    /* Object类中没有comareTo()方法，此方法存在于Comparable接口中，因此
     * 向上擦除到此类就好，故设置上界为Comparable接口
     */
    public static <T extends Comparable<T>> T max(T x, T y, T z){
        T max = x;
        // 对象的比较用compareTo()方法,而不是大于小于号
        if ( y.compareTo( max ) > 0 ){
            max = y;
        }
        if ( z.compareTo( max ) > 0 ){
            max = z;
        }
        return max;
    }
    public static void main( String args[] ){
        System.out.println(max(3, 4, 5));
        System.out.println(max( 6.6, 8.8, 7.7 ) );
        System.out.println(max( "你", "我", "他" ) );

        GenericStack<Integer> s1 = new GenericStack<Integer>();
        s1.push(10);
        s1.push(20);
        int data = s1.getTop();
        System.out.println(data);

        ArrayList<Person> list = new ArrayList<Person>();

        list.add(new Person("你"));
        list.add(new Person("我"));
        list.add(new Person("他"));
        System.out.println(GenericAlg.findMaxPerson(list));
    }
}
/** 用泛型实现一个简单的栈 */
class GenericStack<T>{
    private T[] elem;
    private int top;
    public GenericStack(){
        this(10);
    }

    public GenericStack(int size){
        // 不能new泛型类型的数组new T[]
        this.elem = (T[])new Object[size];
        this.top = 0;
    }
    /** 元素压栈 */
    public void push(T val){
        this.elem[this.top++] = val;
    }
    /** 元素出栈 */
    public void pop(){
        // 元素出栈后该位置置为null，防止内存泄漏
        this.elem[this.top-1] = null;
        --this.top;
    }
    /** 获取栈顶元素 */
    public T getTop(){
        return this.elem[this.top - 1];
    }
}

class GenericAlg {
    //下界：是否有T类型的基类实现了Comparable接口
    public static<T extends Comparable> T findMaxPerson(ArrayList<T> list){
        T maxPerson = list.get(0);
        for(int i = 1;i < list.size();i++){
            if(maxPerson.compareTo(list.get(i)) < 0){
                maxPerson = list.get(i);
            }
        }
        return maxPerson;
    }
}
/** 继承了Comparable接口并重写了compareTo()方法，故Person类就是通配符的下界 */
class Person implements Comparable<Person>{
    private String name;
    public Person(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }

    @Override
    public int compareTo(Person p) {
        return name.compareTo(p.name);
    }
}