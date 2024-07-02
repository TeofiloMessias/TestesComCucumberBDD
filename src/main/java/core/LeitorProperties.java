package core;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LeitorProperties {
    public String getProp(String param) {
        Properties props = new Properties();
        FileInputStream file = null;
        try {
            file = new FileInputStream(".\\src\\test\\resources\\properties\\config.properties");
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

        try {
            props.load(file);
        } catch (IOException e) {

            e.printStackTrace();
        }
        return props.getProperty(param);
    }

}