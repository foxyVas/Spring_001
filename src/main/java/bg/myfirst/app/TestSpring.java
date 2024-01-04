package bg.myfirst.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        //create connection to application context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // ("Bean ID" in applicationContext.xml, class in project)
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());

        // application should be closed
        context.close();
    }
}
