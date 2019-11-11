package test.pojo;

public class PersonSon {
    private Integer id;

    private String userName;

    private Integer parId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getParId() {
        return parId;
    }

    public void setParId(Integer parId) {
        this.parId = parId;
    }

    @Override
    public String toString() {
        return "PersonSon{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", parId=" + parId +
                '}';
    }
}