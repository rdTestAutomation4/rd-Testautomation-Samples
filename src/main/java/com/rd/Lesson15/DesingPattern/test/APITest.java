package com.rd.Lesson15.DesingPattern.test;

public class APITest {
    public static void main(String[] args) {

        APIRequest.Data data = APIRequest.Data.builder()
                .id("1")
                .type("type")
                .build();

        APIRequest.Attributes attributes = APIRequest.Attributes.builder()
                .title("title")
                .age(18)
                .name("name")
                .body("body")
                .updated("updated")
                .build();
        APIRequest.IncludedItem includedItem = APIRequest.IncludedItem.builder()
                .attributes(attributes)
                .build();
    }
}
