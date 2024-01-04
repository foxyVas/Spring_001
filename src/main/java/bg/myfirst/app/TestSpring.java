package bg.myfirst.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        /*
        // todo my first lesson
        //create connection to application context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // ("Bean ID" in applicationContext.xml, class in project)
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());

        // application should be closed
        context.close();


        // todo 2 lesson

        //create connection to application context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // ("Bean ID" in applicationContext.xml, class in project)
        Music music = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        // application should be closed
        context.close();
         */

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();

        context.close();

    }
}
