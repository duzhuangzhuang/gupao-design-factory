package com.dzzread.easyFactory;


import com.dzzread.domian.Book;

public class EasyFactory {

    /*public Book getBean(String name){
        if("Book".equals(name)){
            return new Book();
        }
        return null;
    }*/
    public Book getBean(String clazzNmae){
        if (clazzNmae!=null && clazzNmae.length()>0){

            Book book = null;
            try {
                book = (Book) Class.forName(clazzNmae).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return book;

        }
        return null;
    }

    public Book getBean(Class clazz) throws IllegalAccessException, InstantiationException {
        if(clazz != null){
            return (Book)clazz.newInstance();
        }
        return null;
    }
}
