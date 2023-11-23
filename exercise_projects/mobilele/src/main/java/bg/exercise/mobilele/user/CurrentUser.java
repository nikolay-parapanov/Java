package bg.exercise.mobilele.user;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Getter
@Setter
@Component
@SessionScope
public class CurrentUser {

    private String name;
    private boolean loggedIn;

    public void clear(){
        loggedIn = false;
        name = null;
    }

}
