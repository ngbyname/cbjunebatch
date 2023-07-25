package com.code.bull.commonutils.applicationutils.constants;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ConstantUtils {

    private static ConstantUtils constants;
    private final Properties prop;
    private static String env = System.getProperty("env");
    private static final String USER_DIR = System.getProperty("user.dir");
    private static final String RESOURCE_FILE_PATH = USER_DIR + "/src/main/resources/properties/";
    private static final String COMMON_FILE_PATH = RESOURCE_FILE_PATH + "common.properties";
    private static final String MSG_FILE_PATH = RESOURCE_FILE_PATH + "message.properties";
    private static final String ENV_FILE_PATH = RESOURCE_FILE_PATH + env + ".properties";
    private static final List<String> fileList = Arrays.asList(COMMON_FILE_PATH, MSG_FILE_PATH, ENV_FILE_PATH);

    private ConstantUtils() {
        prop = new Properties();
        fileList.forEach(file -> {
            Scanner inFile;
            try {
                inFile = new Scanner(new FileReader(file));
                inFile.next();
            } catch (FileNotFoundException ex) {
                ex.getMessage();
            }
            try {
                InputStream inputStream = Files.newInputStream(Paths.get(file));
                prop.load(inputStream);
            } catch (IOException ex) {
                ex.getMessage();
            }
        });
    }


    /**
     * This method will return the value corresponding to your key
     *
     * @param key the key
     * @return the value
     */
    public String getValue(String key) {
        return prop.getProperty(key);
    }

    /**
     * This method will initialize the object for ConstantUtils class
     */
    public static ConstantUtils getInstance() {
        if (constants == null) {
            constants = new ConstantUtils();
        }
        return constants;
    }


}
