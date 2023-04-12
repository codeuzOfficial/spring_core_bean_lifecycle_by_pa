package dasturlash.uz;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {
    private String nickName;

    @Override
    public void destroy() throws Exception {
        System.out.println("Before bean destroying.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After bean initialization.");
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
