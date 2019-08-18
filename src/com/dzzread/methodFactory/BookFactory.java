package com.dzzread.methodFactory;

import com.dzzread.domian.BaseBook;
import com.dzzread.domian.Book;

public class BookFactory implements BaseFactory {

    @Override
    public BaseBook getBean() {
        return new Book();
    }
}
