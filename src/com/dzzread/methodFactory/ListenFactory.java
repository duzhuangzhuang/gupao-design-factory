package com.dzzread.methodFactory;

import com.dzzread.domian.BaseBook;
import com.dzzread.domian.ListenBook;

public class ListenFactory implements BaseFactory{
    @Override
    public BaseBook getBean() {
        return new ListenBook();
    }
}
