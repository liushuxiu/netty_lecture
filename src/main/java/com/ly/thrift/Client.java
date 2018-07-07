package com.ly.thrift;

import io.netty.channel.unix.Socket;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import thrift.generated.Person;
import thrift.generated.PersonService;

public class Client {

    public static void main(String[] args)  {
        TTransport transport =new TFramedTransport(new TSocket("localhost",8899),600);
        TProtocol protocol = new TCompactProtocol(transport);
        PersonService.Client client =new PersonService.Client(protocol);


        try {
            transport.open();
            Person person=client.getPersonByUsername("zhangsan");

            System.out.println(person.getUsername());
            System.out.println(person.getAge());
            System.out.println(person.isMarried());
            System.out.println("-----------------------");
            Person person1=new Person();


            person1.setUsername("lisi");
            person1.setAge(100);
            person1.setMarried(true);
            client.savePerson(person1);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            transport.close();
        }
    }
}
