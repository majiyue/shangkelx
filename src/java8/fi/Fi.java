package java8.fi;


import java.util.Iterator;

@FunctionalInterface   //注解，表示接口中只能有一个方法。  只能有一个非object方法。

public interface Fi<T> {

    int compare(T o1,T o2);


    boolean equals(Object obj);



}

interface X<T>{
    int m(Iterator<String> arg,Class  c);
}


interface Y<T>{
    int m(Iterator<String> arg,Class c);
}

@FunctionalInterface


interface Z extends X,Y{

}

