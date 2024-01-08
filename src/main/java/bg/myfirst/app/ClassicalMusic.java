package bg.myfirst.app;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
//@Scope("prototype")
@Scope("singleton")
public class ClassicalMusic implements Music{

    private ClassicalMusic() {};

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("Factory Method");
        return new ClassicalMusic();
    }

    //@PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    //@PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destroy");
    }

    @Override
    public List<String> getSong() {
        List<String> songs = new ArrayList<>(3);
        songs.add("1 Cl");
        songs.add("2 Cl");
        songs.add("3 Cl");
        return songs;
    }
}