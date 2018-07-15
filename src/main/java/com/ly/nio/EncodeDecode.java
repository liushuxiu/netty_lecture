package com.ly.nio;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class EncodeDecode {
    public static void main(String[] args) throws Exception {

        String inputFile = "enDeInput";
        String outFile = "enDeOutput.txt";
        RandomAccessFile input = new RandomAccessFile(inputFile, "r");
        RandomAccessFile output = new RandomAccessFile(outFile, "rw");
        FileChannel inputChannel = input.getChannel();
        FileChannel outputChannel = output.getChannel();
        long len = new File(inputFile).length();
        MappedByteBuffer inputData = inputChannel.map(FileChannel.MapMode.READ_ONLY, 0, len);
        System.out.println("==================");
        Charset.availableCharsets().forEach((k, v) -> {
            System.out.println(k + "  :  " + v);

        });
//
//        Charset charset = Charset.forName("GBK");
//        CharsetDecoder decoder = charset.newDecoder();
//        CharsetEncoder encoder = charset.newEncoder();
//        CharBuffer buffer = decoder.decode(inputData);
//        ByteBuffer outputData = encoder.encode(buffer);
//        outputChannel.write(outputData);


        outputChannel.write(inputData);
        input.close();
        output.close();

    }
}
