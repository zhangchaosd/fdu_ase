package top.dibazu.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author xywu
 * @date 2021/03/06
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    private String username; //用户名
    private String nickname; //收件人姓名
    private String password; //密码
    private String address; //地址
    private String phone; //电话
    private Integer authority; //身份  1：管理员；2：卖家；3：买家

    // 第三：自动加入空构造方法，加入get，set方法
    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
