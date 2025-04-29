package com.rd.Lesson10;

public enum Environment {
    DEV("Development","https://dev.google.com"),
    TEST("Test", "https://test.google.com"),
    RC("Release Candidate","https://rc.google.com"),
    PROD("Prod", "https://www.google.com");

    private final String ortam;
    private final String url;

    Environment(String ortam, String url) {
        this.ortam = ortam;
        this.url = url;
    }

    public String getOrtam(Environment environment){
        return environment.ortam;
    }

    public String getUrl(Environment environment){
        return environment.url;
    }
}

