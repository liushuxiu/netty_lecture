package com.ly.fourth;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.concurrent.TimeUnit;

public class MyServer {

    public static void main(String[] args) throws InterruptedException {
        EventLoopGroup boss =new NioEventLoopGroup();
        EventLoopGroup worker= new NioEventLoopGroup();

        try {
            ServerBootstrap serverBootstrap= new ServerBootstrap();
            serverBootstrap.group(boss,worker).channel(NioServerSocketChannel.class).
                    handler(new LoggingHandler(LogLevel.INFO))
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {

                            ChannelPipeline pipeline=ch.pipeline();
                            pipeline.addLast(new IdleStateHandler(3,5,10,TimeUnit.SECONDS));
                            pipeline.addLast(new MyServerHandler());
                        }
                    });

            ChannelFuture future = serverBootstrap.bind(8899).sync();
            future.channel().closeFuture().sync();
        }finally {
            boss.shutdownGracefully();
            worker.shutdownGracefully();
        }


    }
}
