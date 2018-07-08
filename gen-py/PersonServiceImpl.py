from data import ttypes


class PersonServiceImpl:
    def getPersonByUsername(self, username):
        print "got client params: " + username

        person = ttypes.Person()
        person.username = username
        person.age = 28
        person.married = False

        return person

    def savePerson(self, person):
        print "got clietn param"
        print person.username
        print person.age
        print person.married
