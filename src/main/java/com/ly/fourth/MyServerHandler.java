package com.ly.fourth;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.util.concurrent.EventExecutorGroup;

public class MyServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            IdleStateEvent event = (IdleStateEvent) evt;
            String evenType = null;

            switch (event.state()) {
                case READER_IDLE:
                    evenType="读空闲";
                    break;

                case WRITER_IDLE:
                    evenType="写空闲";
                    break;

                case ALL_IDLE:
                    evenType="读写空闲";
                    break;
            }

            System.out.println(ctx.channel().remoteAddress()+"超时时间: "+evenType);

        }
    }
}
