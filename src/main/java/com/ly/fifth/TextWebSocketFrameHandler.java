package com.ly.fifth;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.concurrent.EventExecutorGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

import java.time.LocalTime;

public class TextWebSocketFrameHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {

    private  static ChannelGroup channelGroup=new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, TextWebSocketFrame msg) throws Exception {
        System.out.println("服务器收到消息：" +msg.text());


       channelGroup.forEach(channel -> {
           ctx.channel().writeAndFlush(new TextWebSocketFrame("服务器当前时间"+LocalTime.now()));
       });

    }


    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        Channel channel=ctx.channel();

        System.out.println("handlerAdded "+ctx.channel().id().asLongText());
        channelGroup.writeAndFlush("服务器- "+channel.remoteAddress()+"加入 ");
        channelGroup.add(channel);
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

        System.out.println("channelActive---------------------");

    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        System.out.println("handlerRemoved "+ctx.channel().id().asLongText());
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        System.out.println("异常发生");
        ctx.close();
    }
}
