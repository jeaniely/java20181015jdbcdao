package com.neuedu.dao.imp;

import com.neuedu.dao.IStudentDAO;
import com.neuedu.javabean.Student;
import com.neuedu.util.GetResultSet;
import com.neuedu.util.UpdateQuery;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDAOImpl implements IStudentDAO {
    //ctrl+o 或者 atl+enter


    @Override
    public List<Student> getAll() {

        String sql="select * from student";
        List<Student> listu=UpdateQuery.query(sql, new GetResultSet<Student>() {
            @Override
            public Student get(ResultSet rs) throws SQLException {
                Student student=new Student();
                student.setSno(rs.getString("sno"));
                student.setSname(rs.getString("sname"));
                student.setSsex(rs.getString("ssex"));
                student.setSage(rs.getInt("sage"));
                student.setSdept(rs.getString("sdept"));
                student.setBirthday(rs.getDate("birthday"));

                return student;
            }
        });
        return listu;
    }

    @Override
    public Student getOne(String sno) {
        String sql="select * from student";
        List<Student> listu=UpdateQuery.query(sql, new GetResultSet<Student>() {
            @Override
            public Student get(ResultSet rs) throws SQLException {
                Student student=new Student();
                student.setSno(rs.getString("sno"));
                student.setSname(rs.getString("sname"));
                student.setSsex(rs.getString("ssex"));
                student.setSage(rs.getInt("sage"));
                student.setSdept(rs.getString("sdept"));
                student.setBirthday(rs.getDate("birthday"));

                return student;
            }
        });
        if(listu==null&& listu.size()==0){
            return null;
        }
        return listu.get(0);
    }

    @Override
    public int delete(String sno) {
        String sql="delete from student where sno=?";

        return UpdateQuery.update(sql,sno);
    }

    @Override
    public int insert(Student s) {
        String sql="insert into student(sno,sname,ssex,sage,sdept,birthday) values(?,?,?,?,?,?)";
        return UpdateQuery.update(sql,s.getSno(),s.getSname(),s.getSsex(),s.getSage(),s.getSdept(),s.getBirthday());
    }

    @Override
    public int update(Student s) {
        String sql="update student set sname=?,ssex=?,sage=?,sdept=?,birthday=? where sno=?";
        return UpdateQuery.update(sql,s.getSname(),s.getSsex(),s.getSage(),s.getSdept(),s.getBirthday(),s.getSno());

    }
}
