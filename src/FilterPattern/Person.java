package FilterPattern;

/**
 * 用户
 *
 * @Author 富贵
 * @Date 2023/10/27 13:43
 * @Version 1.0
 */
public class Person {

    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String
    getMaritalStatus() {
        return maritalStatus;
    }
}
