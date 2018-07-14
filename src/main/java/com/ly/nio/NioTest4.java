package com.ly.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest4 {

    public static void main(String[] args) throws Exception{
        FileInputStream inputStream=new FileInputStream("input");
        FileOutputStream outputStream=new FileOutputStream("output");

        FileChannel inputChannel =inputStream.getChannel();
        FileChannel outputChannel=outputStream.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(512);

        while (true){
            buffer.clear();  //注释此行会发生死循环,当limit==position 不会触发流的读事件,永远return 0
            int read =inputChannel.read(buffer);

            System.out.println("read:   "+read);

            if (-1 == read){
                break;
            }

            buffer.flip();
            outputChannel.write(buffer);


        }

        inputChannel.close();
        outputChannel.close();

    }
}
