package bg.myfirst.app;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "I was made for loving you <333";
    }
}
