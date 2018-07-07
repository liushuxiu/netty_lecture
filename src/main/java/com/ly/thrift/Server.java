package com.ly.thrift;

import com.thrift.generated.PersonService;
import org.apache.thrift.TProcessorFactory;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.THsHaServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TFastFramedTransport;
import org.apache.thrift.transport.TNonblockingServerSocket;


public class Server {

    public static void main(String[] args) throws Exception {
        TNonblockingServerSocket socket=new TNonblockingServerSocket(8899);
        THsHaServer.Args arg=new THsHaServer.Args(socket).minWorkerThreads(2).maxWorkerThreads(4);
        PersonService.Processor<ServiceImpl> processor=new PersonService.Processor<>(new ServiceImpl());

        arg.protocolFactory(new TCompactProtocol.Factory());

        arg.transportFactory(new TFastFramedTransport.Factory());

        arg.processorFactory(new TProcessorFactory(processor));

        TServer server=new THsHaServer(arg);
        System.out.println("thrift server start");

        server.serve();




    }
}
