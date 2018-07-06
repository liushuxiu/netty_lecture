package com.shengsiyuan.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;

public class Test {


    public static void main(String[] args) throws InvalidProtocolBufferException {
        DataInfo.Student student = DataInfo.Student.newBuilder()
                .setName("刘炎")
                .setAge(28)
                .setAddress("九江").build();
        byte [ ]student2ByteArray=student.toByteArray();
        DataInfo.Student student1 = DataInfo.Student.parseFrom(student2ByteArray);


        assert 3>=3 : "执行失败！";
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getAddress());
    }
}
