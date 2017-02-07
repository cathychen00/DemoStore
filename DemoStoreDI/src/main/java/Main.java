import bean.Category;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 陈敬 on 2017/2/7.
 */
public class Main {
    public static void main(String[] args){
        //创建bean实例
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
        Category category=applicationContext.getBean(Category.class);
        //设置属性
        category.setCateId(1);
        category.setCateName("书籍");
        //显示结果
        System.out.println(category.toString());
    }
}
