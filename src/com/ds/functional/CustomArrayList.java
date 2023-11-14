package com.ds.functional;

import java.util.ArrayList;

//Custome arrayList that doesnot allow duplicate
public class CustomArrayList extends ArrayList {

    @Override
    public boolean add(Object o) {
       if(this.contains(o)) {
           return true;
       }else {
           return super.add(o);
       }
    }
}
