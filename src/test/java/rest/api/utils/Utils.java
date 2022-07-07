package rest.api.utils;


import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utils {
    public Utils() {
    }

    public static String getProperties(String propertie) {
        try {
            InputStream inputStream = new FileInputStream("setup.properties");
            Properties properties = new Properties();
            properties.load(inputStream);
            return properties.getProperty(propertie);
        } catch (IOException var3) {
            var3.printStackTrace();
            Assert.fail("Error to load properties");
            return "";
        }
    }

    public static void setProperties(String propertie, String valor) {
        try {
            FileInputStream in = new FileInputStream("setup.properties");
            Properties props = new Properties();
            props.load(in);
            in.close();
            FileOutputStream out = new FileOutputStream("setup.properties");
            props.setProperty(propertie, valor);
            props.store(out, "Data essencials");
            out.close();
        } catch (IOException var5) {
            var5.printStackTrace();
            Assert.fail("Error to load properties");
        }

    }





}
