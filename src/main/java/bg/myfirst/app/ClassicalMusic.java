package bg.myfirst.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ClassicalMusic implements Music{

    private ClassicalMusic () {

    }

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("Factory method - classical music");
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization...");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction...");
    }
    @Override
    public String getSong() {
        return "hungarian rhapsody";
    }
}
