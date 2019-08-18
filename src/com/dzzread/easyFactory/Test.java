package com.dzzread.easyFactory;

import com.dzzread.domian.Book;

public class Test {
    public static void main(String[] args) {
        EasyFactory easyFactory = new EasyFactory();
        Book book = null;
        try {
            book = easyFactory.getBean(Book.class);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        book.readBook();
    }
}
