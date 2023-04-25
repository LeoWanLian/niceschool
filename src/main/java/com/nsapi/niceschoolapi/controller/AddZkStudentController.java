package com.nsapi.niceschoolapi.controller;

import com.nsapi.niceschoolapi.entity.*;
import com.nsapi.niceschoolapi.service.AddStudentService;
import com.nsapi.niceschoolapi.service.AddZkStudentService;
import com.nsapi.niceschoolapi.service.StudentService;
import com.nsapi.niceschoolapi.service.ZkStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
//使用它标记的类就是一个SpringMVC Controller 对象。分发处理器将会扫描使用了该注解的类的方法
public class AddZkStudentController {
    @Autowired  //  自动注入
    private ZkStudentService zkStudentService;
    @Autowired
    private AddZkStudentService addZkStudentService;

    @RequestMapping("/addZkStudentPage")
    public String selPolitics(Model model){
        //  查询政治面貌表
        List<ZkMajor> stupol = zkStudentService.selZkMajor();
        model.addAttribute("stupol",stupol);
        return "view/student/addZkStudent";
    }

    //  添加学生
    @RequestMapping("addZkStudent") //   用来处理请求地址映射的注解
    @ResponseBody   // 通常用来返回JSON数据给客户端
    public LayuiResult<ZkStudentDB> addStudent(StudentVO studentVO, String birthday, String tertime) throws Exception{
        LayuiResult<ZkStudentDB> result= new LayuiResult<>();
        //  将接收到的时间进行类型转换
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date1=format.parse(birthday);
        Date date2=format.parse(tertime);
        studentVO.setSbirthday(date1);
        studentVO.setEntertime(date2);
        //  判断该年份是否已存在学生
        Integer year = addZkStudentService.selectStuYear(studentVO.getClassid());
        if(year !=0 ){
            //  若该年份学生为空时 则添加一条分割线
            Integer fenge = addZkStudentService.stuSegmentation(studentVO.getClassid());
        }
        //  生成学生学号
        String stui = addZkStudentService.selStuid(studentVO.getGid());
        studentVO.setStuid(stui);
        studentVO.setSid(Integer.valueOf(stui));
        //  根据前台传来信息添加学生
        Integer addStudent = addZkStudentService.addStudent(studentVO);
        //  获取学号
        String stuid = studentVO.getStuid();
        //  根据学号查询学生id编号
        Integer sid = addZkStudentService.selectSid(stuid);
        //  获取所选专业id
        Integer mid = studentVO.getMid();
        //  根据学生专业查询该专业开设的必修课程
        List<CourseDB> selCourse = addZkStudentService.selCourse(mid);
        for(CourseDB cou : selCourse){
            //  将学生id以及必修课程的id添加至学生选课表
            Integer addStuCourse = addZkStudentService.addStuCourse(sid,cou.getCid());
            System.out.println(addStuCourse);
        }

        //  班级人数+1
//        Integer selClassinfo = addZkStudentService.selecteClassinfo(studentVO.getClassid());
        //  年级人数+1
//        Integer selGrade = addZkStudentService.selecteGrade(studentVO.getGid());
        //  专业人数+1
//        Integer selMajor = addZkStudentService.selecteMajor(studentVO.getMid());
        //  系部人数+1
//        Integer selDepartment = addZkStudentService.selecteDepartment(studentVO.getDid());

        //  根据学号查询信息
        List<ZkStudentDB> stu = addZkStudentService.selectMessage(stuid);
        //  查询sys_role角色id
        String id = addZkStudentService.selectRole();
        result.setData(stu);
        result.setMsg(id);
        return result;

    }
}

