package com.ly.nio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest3 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("NioTest3.txt");
        FileChannel fileChannel =fileOutputStream.getChannel();

        byte [ ] message="hello world welcome , nihao".getBytes();

        ByteBuffer buffer = ByteBuffer.allocate(512);
        for (int i = 0; i < message.length; i++) {
            buffer.put(message[i]);

        }

        buffer.flip();

        fileChannel.write(buffer);
        fileOutputStream.close();
    }
}
