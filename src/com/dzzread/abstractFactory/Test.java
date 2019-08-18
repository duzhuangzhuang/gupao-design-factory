package com.dzzread.abstractFactory;

import com.dzzread.domian.ActivityInfo;
import com.dzzread.domian.AuthorInfo;
import com.dzzread.domian.BaseBook;

public class Test {
    public static void main(String[] args) {
        //图书
        BookFactory bookFactory = new BookFactory();
        BaseBook book = bookFactory.getBook();
        ActivityInfo activityInfo = bookFactory.getActivityInfo();
        AuthorInfo authorInfo = bookFactory.getAuthorInfo();
        book.readBook();
        //听书
        ListenFactory listenFactory = new ListenFactory();
        BaseBook listenBook = listenFactory.getBook();
        ActivityInfo listenActivityInfo = listenFactory.getActivityInfo();
        AuthorInfo listenAuthorInfo = listenFactory.getAuthorInfo();
        listenBook.readBook();
        //漫画
        CartoonFactory cartoonFactory = new CartoonFactory();
        BaseBook cartoonBook = cartoonFactory.getBook();
        ActivityInfo cartoonActivityInfo = cartoonFactory.getActivityInfo();
        AuthorInfo cartoonAuthorInfo = cartoonFactory.getAuthorInfo();
        cartoonBook.readBook();
    }
}
