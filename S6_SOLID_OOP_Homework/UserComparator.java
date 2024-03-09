package javaTasks.S6_SOLID_OOP_Homework;

import java.util.Comparator;

/** Liskov substitution Principle - принцип подстановки Барбары Лисков.
 *  Есть возможность вместо базового (User) класса подставить любого его наследника
 */
public class UserComparator <T extends User> implements Comparator<T>{

        @Override
        public int compare(T o1, T o2) {
            int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
            if (resultOfComparing==0){
                resultOfComparing=o1.getFirstName().compareTo(o2.getFirstName());
                if( resultOfComparing==0){
                    return o1.getLastName().compareTo(o2.getLastName());
                }
                else {return resultOfComparing;}
            }
            else {
                return resultOfComparing;
            }
        }
    }

