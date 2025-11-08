package com.example.moviebooking.config;

public class SystemConfig {
    public static SystemConfig INSTANCE ;
    private String dbUrl;
    private String environment;
    private SystemConfig() {
        this.dbUrl= "";
    }
    public static synchronized SystemConfig getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SystemConfig();
        }
        return INSTANCE;
    }
}