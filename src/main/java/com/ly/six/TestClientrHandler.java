package com.ly.six;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class TestClientrHandler extends SimpleChannelInboundHandler<MyDataInfo.MyMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MyDataInfo.MyMessage msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {









        
        System.out.println("--------------------------");
        MyDataInfo.Person person =MyDataInfo.Person.newBuilder()
                .setName("刘炎").setAge(28).setAddress("北京").build();
        System.out.println("haha");
        ctx.channel().writeAndFlush(person);
    }
}
