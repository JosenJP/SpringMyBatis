package SpringMyBatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.*;
/*
@Configuration
@ComponentScan(basePackages= {"ServiceImpl","dao","IService","model","SpringMyBatis"})
public class AppContextConfig
{
    @Bean(name = "appMain")
    public App appInstance()
    {
        return new App();
    }
    
    
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws IOException
    {
        String resource = "DBConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }

}
    */
