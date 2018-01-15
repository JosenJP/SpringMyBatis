package SpringMyBatis;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import ServiceImpl.StudentServiceImpl;

/**
 * Hello world!
 *
 */
@Component
public class App 
{
    @Autowired
    private StudentServiceImpl studentService;
    
    public static void main( String[] args )
    {
        /*
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.register(AppContextConfig.class);
        appContext.refresh();
        */
        
        String conf ="Spring-MyBatis.xml";
        ApplicationContext appContext = new ClassPathXmlApplicationContext(conf);
        
        App app = appContext.getBean(App.class);
        app.StartUp();
    }
    
    public void StartUp()
    {
        PrintString(studentService.getStudentNumber().toString());
    }
    
    private void PrintString(String str)
    {
        System.out.println(str);
    }
}
