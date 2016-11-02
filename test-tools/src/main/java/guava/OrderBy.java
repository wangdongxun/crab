package guava;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

import java.util.Comparator;
import java.util.List;

/**
 * Created by wdx on 2016/11/2.
 */
public class OrderBy {
    public static void main(String[] args) {
        class Person {
            String lastName;

            public Person(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            String firstName;

            @Override
            public String toString() {
                return "Person{" +
                        "firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        '}';
            }
        }

        Comparator<Person> byLastName = new Comparator<Person>() {
            public int compare(final Person p1, final Person p2) {
                return p2.getLastName().compareTo(p1.getLastName());
            }
        };


        Comparator<Person> byFirstName = new Comparator<Person>() {
            public int compare(final Person p1, final Person p2) {
                return p2.getFirstName().compareTo(p1.getFirstName());
            }
        };

        List<Person> persons= Lists.newArrayList();
        persons.add(new Person("aaa","yyy"));
        persons.add(new Person("aaa","www"));
        persons.add(new Person("bbb","www"));
        List<Person> sortedCopy = Ordering.from(byFirstName).compound(byLastName).reverse().sortedCopy(persons);
        for (Person p:sortedCopy){
            System.out.println(p.toString());
        }
    }
}
