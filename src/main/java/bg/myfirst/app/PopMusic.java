package bg.myfirst.app;

import org.springframework.stereotype.Component;

@Component("myPopMusic")
public class PopMusic implements Music{
    @Override
    public String getSong() {
        return "As it was (>_<)";
    }
}
