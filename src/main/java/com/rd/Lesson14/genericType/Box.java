package com.rd.Lesson14.genericType;

public class Box<T, V> {
    private T content;
    private V value;

    public T getContent() {
        return content;
    }

    public V getValue() {
        return  value;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void yazdir(T content, V value){
        System.out.println("Değişkenim :" + content.getClass().getName() );
        System.out.println("Value Tipi: " + value.getClass().getName());

    }
}
