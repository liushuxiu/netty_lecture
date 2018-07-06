package com.ly.six;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import java.util.Random;

public class TestClientrHandler extends SimpleChannelInboundHandler<MyDataInfo.MyMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MyDataInfo.MyMessage msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

        int random =new Random().nextInt();
        MyDataInfo.MyMessage message=null;

        if (0 == random){
            message=MyDataInfo.MyMessage.newBuilder()
                    .setDataType(MyDataInfo.MyMessage.DataType.PersonType)
                          .setPerson(MyDataInfo.Person.newBuilder().setName("刘火火").setAddress("北京").setAge(28).build()).build();
        }else if (1 == random){
            message=MyDataInfo.MyMessage.newBuilder()
                    .setDataType(MyDataInfo.MyMessage.DataType.DogType)
                    .setDog(MyDataInfo.Dog.newBuilder()
                            .setName("一只狗").setAge(8)
                    .build()).build();
        }else {
            message=MyDataInfo.MyMessage.newBuilder()
                    .setDataType(MyDataInfo.MyMessage.DataType.CatType)
                    .setCat(MyDataInfo.Cat.newBuilder()
                            .setName("一只狗").setCity("上海")
                            .build()).build();
        }



//        System.out.println("--------------------------");
//        MyDataInfo.Person person =MyDataInfo.Person.newBuilder()
//                .setName("刘炎").setAge(28).setAddress("北京").build();
//        System.out.println("haha");
        ctx.channel().writeAndFlush(message);
    }
}
