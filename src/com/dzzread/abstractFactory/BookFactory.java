package com.dzzread.abstractFactory;

import com.dzzread.domian.ActivityInfo;
import com.dzzread.domian.AuthorInfo;
import com.dzzread.domian.BaseBook;
import com.dzzread.domian.Book;

public class BookFactory implements abstractBaseFactory {

    @Override
    public BaseBook getBook() {
        return new Book();
    }

    @Override
    public ActivityInfo getActivityInfo() {
        return new ActivityInfo();
    }

    @Override
    public AuthorInfo getAuthorInfo() {
        return new AuthorInfo();
    }
}
