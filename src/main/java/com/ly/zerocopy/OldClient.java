package com.ly.zerocopy;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.Socket;

public class OldClient {

    public static void main(String[] args) throws Exception{
        Socket socket=new Socket("localhost", 8899);
        String fileName = "/home/ms/eclipse-jee-oxygen-3a-linux-gtk-x86_64.tar.gz";

        InputStream inputStream=new FileInputStream(fileName);
        DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());

        byte [] buffer=new byte[4096];
        long readCount=0;
        long total=0;
        long startTime=System.currentTimeMillis();

        while ((readCount = inputStream.read(buffer)) >= 0) {
            total+=readCount;
            dataOutputStream.write(buffer);
        }

        System.out.println("总的发送字节数： "+readCount+",  耗时：  "+(System.currentTimeMillis()-startTime));
        dataOutputStream.close();
        inputStream.close();
        socket.close();
    }
}
