package com.wesleybertipaglia.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
    private static final Properties properties = new Properties();

    static {
        try (InputStream input = Config.class.getClassLoader().getResourceAsStream("app.properties")) {
            if (input != null) {
                properties.load(input);
            } else {
                throw new RuntimeException("app.properties file not found.");
            }
        } catch (IOException ex) {
            throw new RuntimeException("Failed to load app.properties", ex);
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}
