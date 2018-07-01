package com.ly.third;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.EventExecutorGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

public class ChatServerHandler extends SimpleChannelInboundHandler<String > {

    private  static ChannelGroup  channelGroup=new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {

        Channel channel=ctx.channel();
        channelGroup.forEach(ch-> {
            if (ch !=channel){
                ch.writeAndFlush(channel.remoteAddress()+" 发送的消息 "+msg+"\n");
            }else {
                ch.writeAndFlush("自己 "+msg+"\n");
            }
        });
    }

//    @Override
//    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
//        Channel channel = ctx.channel();
//
//        channelGroup.writeAndFlush("服务器- "+channel.remoteAddress()+"加入 ");
//        channelGroup.add(channel);
//
//    }
//
//    @Override
//    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
//        Channel channel=ctx.channel();
//        channelGroup.writeAndFlush("服务器- "+channel.remoteAddress()+"离开 ");
//    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();

        channelGroup.writeAndFlush("服务器- "+channel.remoteAddress()+"加入 ");
        channelGroup.add(channel);
        System.out.println(channel.remoteAddress()+"   上线");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        Channel channel=ctx.channel();
        channelGroup.writeAndFlush("服务器- "+channel.remoteAddress()+"离开 ");
        System.out.println(channel.remoteAddress()+"   下线");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
       // ctx.channel().close();
        ctx.close();
    }
}
