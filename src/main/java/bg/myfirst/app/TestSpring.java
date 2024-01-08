package bg.myfirst.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        /*
        // todo my 1 lesson start
        // create connection to application context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        // ("Bean ID" in the applicationContext.xml, class in project)
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        // applicationContext should be closed
        context.close();
        // todo 2nd lesson start
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        // ("Bean ID" in the applicationContext.xml, class in project)
        Music music= context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();
        context.close();
        // todo 3rd lesson start
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        context.close();
        // todo 4rd lesson
            scope="prototype" or "singleton"
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        firstMusicPlayer.playMusic();
        boolean comparison = firstMusicPlayer == secondMusicPlayer;
        System.out.println(firstMusicPlayer.getName());
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(comparison);
        firstMusicPlayer.setVolume(10);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());
        context.close();
        // todo 5th lesson
            init destroy
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        ClassicalMusic classicalMusic = context.getBean("musicBeanClassic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("musicBeanClassic", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
        System.out.println(classicalMusic2.getSong());
        // applicationContext should be closed
        context.close();
        // todo 6th lesson
            Factory Method
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        ClassicalMusic classicalMusic = context.getBean("musicBeanClassic", ClassicalMusic.class);
        context.close();
        // todo 7th lesson
            @Component -> through Annotations
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
       RockMusic rockMusic = context.getBean("musicBeanRock", RockMusic.class);
       // if we don't write name of the component it will be named as Class name
       PopMusic popMusic = context.getBean("popMusic", PopMusic.class);
       System.out.println(rockMusic.getSong());
       System.out.println(popMusic.getSong());
       context.close();

       // todo 8th lesson
           @Autowired
       // @Autowired. Внедрение зависимостей (Dependency Injection)
       // Spring scan all classes with Annotation @Component and create Beans,
       // then check if this Beans are suits to the @Autowire
       //    @Autowired
       //    public MusicPlayer(Music music) {this.music = music}
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();

        //todo 8th lesson
           @Qualifier
        //    @Autowired
        //    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
        //                       @Qualifier("popMusic") Music music2,
        //                       @Qualifier("musicBeanRock") Music music3) {
        //        this.musicClassic = music1;
        //        this.musicPop = music2;
        //        this.musicRock = music3;
        //    }
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        context.close();

        // todo Homework
        // 1. Classical 3 songs and Rock 3 Songs
        // 2. Music player can get Cl & Rock
        // 3. Create Enum with 2 style Cl & Rock
        // 4. method playMusic() can get Enum
        // 5. method playMusic with random from Cl | Rock + from 3 songs
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        // todo Annotations in Java code
        //  @Scope("singleton") or ("prototype")
        //  @Value("${musicPlayer.name}")
        // in properties
        // <context:property-placeholder location="classpath:musicPlayer.properties"/>
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        //property files appContext and properties
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getName());
        // singleton or prototype (file classical music)
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic1 == classicalMusic2);
        // todo
            IMPORTANT: @PostConstruct and @PreDestroy have been completely removed in Java 11.
            To keep using them, you'll need to add the javax.annotation-api JAR to your dependencies.
        //<dependency>
        //    <groupId>javax.annotation</groupId>
        //    <artifactId>javax.annotation-api</artifactId>
        //    <version>1.3.2</version>
        //</dependency>
        // todo destroy works just with singleton
        //
        //
         */

        // todo JUST with Java Configuration
        //  create new java class SpringConfig with
        //  @Configuration
        //  @ComponentScan("at.first.app")
        //  @PropertySource("classpath:musicPlayer.properties")
        // ACAC
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getName());
        // singleton or prototype (file classical music)
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic1 == classicalMusic2);



    }
}