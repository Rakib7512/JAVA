
package com.mycompany.staticmethodsforlistsandcollections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StaticMethodsForListsAndCollections {

    public static void main(String[] args) {
        List<String> list1=Arrays.asList("Rakib","Parvez","Eiasin");
        List<String>list2=Arrays.asList("Rakib","Parvez","Eiasin");
        Collections.shuffle(list1);
        Collections.sort(list2);
        
        System.out.println(list1);
        System.out.println(list2 );
        
    }
}
