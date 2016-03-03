package com;

import java.io.*;
import java.util.Properties;

public class WWW {

    public void absolutPath() throws IOException {
        Properties properties = new Properties();
        InputStream resourceAsStream = WWW.class.getResourceAsStream("/user_config_data_set.properties");
        properties.load(resourceAsStream);
    }

    public void workMyFile() throws IOException {
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("/d:/parameters.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        InputStream resourceAsStream = WWW.class.getResourceAsStream("/user_config_data_set.properties");
        properties.load(resourceAsStream);

        //дальше - > бегаешь в цикле и считываешь строчки
        String line;

        while ((line = bufferedReader.readLine()) != null) {

            if (properties.containsKey(line)) {
                System.out.println(line + " " + properties.get(line));
            } else {
                System.out.println(line + " is not available");
            }
        }
    }
}
