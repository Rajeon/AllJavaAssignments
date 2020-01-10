package homeworkforwednesday;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class people<toArray> implements Iterator {
    private List<Person> personList;

    public people(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
    public void add(Person person){
        personList.add(person);
    }
    public long findById(long id){
        return id;

    }
    public boolean contains(Person person){
        return personList.contains(person);
    }
    public boolean removeId(Person person){
        return personList.remove(person);

    }
    public void removeAll(){
        System.out.println(personList.removeAll(personList));
    }
    public void count(){
        System.out.println(personList.size());
    }
    public Object[] toArray(){
        return personList.toArray();

    }
    public Iterator<Person> iterator(){
        return personList.iterator();
    }


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer action) {

    }
}
