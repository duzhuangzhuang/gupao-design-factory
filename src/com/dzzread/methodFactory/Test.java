package com.dzzread.methodFactory;

import com.dzzread.domian.BaseBook;


public class Test {
    public static void main(String[] args) {
        //图书
        BookFactory bookFactory = new BookFactory();
        BaseBook book = bookFactory.getBean();
        book.readBook();
        //听书
        BaseFactory listenFactory = new ListenFactory();
        BaseBook listenBook = listenFactory.getBean();
        listenBook.readBook();
        //漫画
        BaseFactory cartoonFactory = new CartoonFactory();
        BaseBook cartoonBook = cartoonFactory.getBean();
        cartoonBook.readBook();
    }

}
