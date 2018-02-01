package io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author: zhangzhiyuan
 * @Date: Created in 2018/2/1 16:15
 */
public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("123.txt");
        byte[] buffer = new byte[1024];
        int hasRead = 0;
        while ((hasRead = inputStream.read(buffer)) > 0){
            System.out.println(hasRead);
        }
    }
}
