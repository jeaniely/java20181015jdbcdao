package com.neuedu.dao;

import com.neuedu.javabean.Student;

import java.util.List;

public interface IStudentDAO {
    /**
     * 查找全部数据
     * @return
     */
    List<Student> getAll();

    /**
     * 根据sno进行查询，
     * 查询出结果为一条记录
     * @param sno
     * @return
     */
    Student getOne(String sno);

    /**
     * 根据sno进行删除
     * @param sno
     * @return
     */
    int delete(String sno);

    /**
     * 插入
     * @param s
     * @return
     */
    int insert(Student s);

    /**
     * 修改
     *  根据sno进行修改
     *  student：不变的数据sno，变：除了sno其他数据
     * @param s
     * @return
     */
    int update(Student s);
}
