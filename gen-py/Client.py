

from data import PersonService
from data import ttypes
from thrift import Thrift
from thrift.transport import TSocket
from thrift.transport import TTransport
from thrift.protocol import TCompactProtocol





try:
    socket=TSocket.TSocket('localhost',8899);
    socket.setTimeout(600)
    
    transport=TTransport.TFramedTransport(socket);
    protocol=TCompactProtocol.TCompactProtocol(transport);
    client = PersonService.Client(protocol)
    
    transport.open();
    person =client.getPersonByUsername("ly")
    print person.username
    print person.age
    print person.married
    
    print '---------------------'
    
    newPerson=ttypes.Person()
    newPerson.username='lisi'
    newPerson.age=30
    newPerson.married=True
    
    client.savePerson(newPerson)
    transport.close()
    
except Thrift.TException,tx:
    print '%s' % tx.message
    
    
    
    
    
    
    


