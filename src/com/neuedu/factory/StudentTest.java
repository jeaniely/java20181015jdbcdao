package com.neuedu.factory;

import com.neuedu.dao.IStudentDAO;
import com.neuedu.dao.imp.StudentDAOImpl;
import com.neuedu.javabean.Student;

import java.util.List;

public class StudentTest {
    //private static IStudentDAO studentDAO=FactoryS.getInstance("学生");
    private static IStudentDAO studentDAO=new StudentDAOImpl();
    public static void main(String[] args) {
       menu(2);
    }

    public static void menu(int i){
        if(i==1){
            List<Student> list=studentDAO.getAll();
            for (Student s:list
                 ) {
                System.out.println(s);
            }
        }else if(i==2){
            String sno="20018014";
            int idao=studentDAO.delete(sno);
            System.out.println("影响的行数："+idao);
        }
    }
}
