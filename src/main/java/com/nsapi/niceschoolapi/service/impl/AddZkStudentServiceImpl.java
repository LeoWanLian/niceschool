package com.nsapi.niceschoolapi.service.impl;

import com.nsapi.niceschoolapi.entity.CourseDB;
import com.nsapi.niceschoolapi.entity.StudentVO;
import com.nsapi.niceschoolapi.entity.ZkStudentDB;
import com.nsapi.niceschoolapi.mapper.AddZkStudentMapper;
import com.nsapi.niceschoolapi.service.AddZkStudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class AddZkStudentServiceImpl implements AddZkStudentService {
    @Resource
    private AddZkStudentMapper addZkStudentMapper;


    //  根据前台传来信息添加学生
    @Override
    public Integer addStudent(StudentVO studentVO) {
        return addZkStudentMapper.addStudent(studentVO);
    }

    //  根据学生专业查询该专业开设的必修课程
    @Override
    public List<CourseDB> selCourse(Integer mid) {
        return addZkStudentMapper.selCourse(mid);
    }

    //  根据学号查询学生id编号
    @Override
    public Integer selectSid(String stuid) {
        return addZkStudentMapper.selectSid(stuid);
    }

    //  将学生id以及必修课程的id添加至学生选课表
    @Override
    public Integer addStuCourse(Integer sid, Integer cid) {
        return addZkStudentMapper.addStuCourse(sid,cid);
    }

    //  生成学生学号
    @Override
    public String selStuid(Integer gid) {
        return addZkStudentMapper.selStuid(gid);
    }

    //  班级人数+1
    @Override
    public Integer selecteClassinfo(Integer classid) {
        return addZkStudentMapper.selecteClassinfo(classid);
    }

    //  年级人数+1
    @Override
    public Integer selecteGrade(Integer gid) {
        return addZkStudentMapper.selecteGrade(gid);
    }

    //  专业人数+1
    @Override
    public Integer selecteMajor(Integer mid) {
        return addZkStudentMapper.selecteMajor(mid);
    }

    //  系部人数+1
    @Override
    public Integer selecteDepartment(Integer did) {
        return addZkStudentMapper.selecteDepartment(did);
    }


    //  判断该年份是否已存在学生
    @Override
    public Integer selectStuYear(Integer classid) {
        return addZkStudentMapper.selectStuYear(classid);
    }

    //  若该年份学生为空时 则添加一条分割线
    @Override
    public Integer stuSegmentation(Integer classid) {
        return addZkStudentMapper.stuSegmentation(classid);
    }

    //  根据学号查询信息
    @Override
    public List<ZkStudentDB> selectMessage(String stuid) {
        return addZkStudentMapper.selectMessage(stuid);
    }

    //  查询sys_role角色id
    @Override
    public String selectRole() {
        return addZkStudentMapper.selectRole();
    }


}
