package com.company;

public class Pair<T,V> {


    T first;
    V second;

    Pair(T t , V v){
        first = t;
        second = v;
    }

    public T getFirst(){
        return first;
    }

    public V getSecond(){
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
