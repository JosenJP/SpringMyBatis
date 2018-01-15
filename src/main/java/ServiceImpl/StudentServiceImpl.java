package ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import IService.IStudentService;
import dao.StudentDomainObjectMapper;

@Component
public class StudentServiceImpl implements IStudentService
{
    @Autowired
    StudentDomainObjectMapper studentDaoService;

    public Integer getStudentNumber()
    {
        return studentDaoService.selectAll().size();
    }

}
