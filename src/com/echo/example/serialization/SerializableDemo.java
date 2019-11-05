package com.echo.example.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * @author echo.guan
 * @date 2019/05/31
 */
public class SerializableDemo {

    public static void main(String[] args) {
        User user = new User();
        user.setName("echo");
        user.setAge(3);
        user.setGender("female");
        user.setBirthday(new Date());
        System.out.println(user);

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
            oos.writeObject(user);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            IOUtils
        }
    }


}
