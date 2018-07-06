package com.ly.fifth;

import io.netty.channel.Channel;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.concurrent.GlobalEventExecutor;

public class Message implements Runnable {
  public     ChannelGroup channels;


    public void remove(Channel channel){
        channels.remove(channel);
    }

    public void add(Channel channel){
        channels.add(channel);
    }


    @Override
    public void run() {
        while (true){

            System.out.println("---------------------------------------");
            String msg="阿弥陀佛";
            channels.forEach(channel -> {
                channel.writeAndFlush(new TextWebSocketFrame(msg));
            });
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
