import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote
public class MyFirstEJB implements IMyFirstEJB{

    public String saySomething(String name) {
        return "Hello " + name;
    }
}
