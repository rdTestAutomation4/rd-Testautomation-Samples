package com.rd.Lesson14.genericType;

public class Box2 {
    private String content;
    private Integer value;

    public String getContent() {
        return content;
    }

    public Integer getValue() {
        return  value;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void yazdir(String content, Integer value){
        System.out.println("Değişkenim :" + content.getClass().getName() );
        System.out.println("Value Tipi: " + value.getClass().getName());

    }
}
