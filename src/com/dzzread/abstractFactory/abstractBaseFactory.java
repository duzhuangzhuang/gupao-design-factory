package com.dzzread.abstractFactory;

import com.dzzread.domian.ActivityInfo;
import com.dzzread.domian.AuthorInfo;
import com.dzzread.domian.BaseBook;

public abstract interface abstractBaseFactory {
    BaseBook getBook();
    ActivityInfo getActivityInfo();
    AuthorInfo getAuthorInfo();

}
