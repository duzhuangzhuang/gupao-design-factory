package com.dzzread.methodFactory;

import com.dzzread.domian.BaseBook;
import com.dzzread.domian.CartoonBook;

public class CartoonFactory implements BaseFactory {
    @Override
    public BaseBook getBean() {
        return new CartoonBook();
    }
}
