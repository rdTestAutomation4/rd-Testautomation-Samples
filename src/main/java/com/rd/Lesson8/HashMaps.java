package com.rd.Lesson8;


import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {


        HashMap<String, String> renkler = new HashMap<>();

        renkler.put("R", "Red");
        renkler.put("B", "Blue");
        renkler.put("W", "White");
        renkler.put("Y", "Yellow");


        System.out.println(renkler.values());

        System.out.println(renkler);

        System.out.println(renkler.get("R"));

    }
}

/*
        HashMap<String, String> header = new HashMap<>();

        header.put("Access-Control-Allow-Origin","*");
        header.put("Content-Type","application/json; charset=utf-8");

        HashMap<String, Object> params = new HashMap<>();
        params.put("body","{'name':'Ahmet', 'surname':'Veli'}");

        System.out.println(header+ " - " +  params);
    }
}
 */