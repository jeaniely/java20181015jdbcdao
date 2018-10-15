package com.neuedu.factory;

import com.neuedu.dao.IStudentDAO;
import com.neuedu.dao.imp.StudentDAOImpl;

public class FactoryS {
    public static IStudentDAO getInstance(String name){
        if(name.equals("学生")){
            return  new StudentDAOImpl();
        }
        return null;
    }
}
