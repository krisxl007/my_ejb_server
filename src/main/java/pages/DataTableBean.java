package pages;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class DataTableBean {

    private List<User> userList = initUserList();

    private List<User> initUserList() {
        if (null == userList)
            userList = new ArrayList<>();

        User user1 = new User();
        User user2 = new User();
        user1.setUserName("dummy name 1");
        user1.setPassword("dummy password 1");
        user1.setTel("dummy tel 1");
        user1.setAddress("dummy address 1");

        user2.setUserName("dummy name 2");
        user2.setPassword("dummy password 2");
        user2.setTel("dummy tel 2");
        user2.setAddress("dummy address 2");

        userList.add(user1);
        userList.add(user2);

        return userList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

}
