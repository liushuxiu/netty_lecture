package com.ly.thrift;

import org.apache.thrift.TException;
import thrift.generated.DataException;
import thrift.generated.Person;
import thrift.generated.PersonService;

public class ServiceImpl implements PersonService.Iface {
    @Override
    public Person getPersonByUsername(String username) throws DataException, TException {

        System.out.println("Get Client paran: "+username);
        Person person =new Person();
        person.setUsername(username);
        person.setAge(20);
        person.setMarried(false);

        return person;
    }

    @Override
    public void savePerson(Person person) throws DataException, TException {

        System.out.println("get client param:");
        System.out.println(person.getUsername());
        System.out.println(person.getAge());
        System.out.println(person.isMarried());



    }
}
