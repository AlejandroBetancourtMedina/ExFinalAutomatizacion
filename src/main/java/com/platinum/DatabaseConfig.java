package com.platinum;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConfig {
    private String url;
    private String username;
    private String password;

    public DatabaseConfig(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public Connection connect() throws Exception {
        return DriverManager.getConnection(url, username, password);
    }
}