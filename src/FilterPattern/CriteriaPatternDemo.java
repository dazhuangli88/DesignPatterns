package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 富贵
 * @Date 2023/10/27 14:44
 * @Version 1.0
 */
public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        //初始化用户列表
        persons.add(new Person("tom", "Male", "Single"));
        persons.add(new Person("jake", "Male", "Married"));
        persons.add(new Person("lily", "Female", "Single"));
        persons.add(new Person("Alice", "Female", "Married"));

        //检查是否为男性
        Criteria male = new CriteriaMale();
        //检查是否为女性
        Criteria female = new CriteriaFemale();
        //检查是否为单身
        Criteria single = new CriteriaSingle();
        //检查是否为男性且单身
        Criteria singleMale = new AndCriteria(single,male);
        //检查是否为女性且单身
        Criteria singleFemale = new OrCriteria(single,female);

        //***感受其中的 AND 和 OR 条件的匹配
        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("Females:");
        printPersons(female.meetCriteria(persons));

        System.out.println("Single Males:");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("Single or  Females:");
        printPersons(singleMale.meetCriteria(persons));

    }

    private static void printPersons(List<Person> persons) {
        for(Person person : persons){
            System.out.println("Person :[ Name: " + person.getName()
                        +", Gender : " +person.getGender()
                        +", MaritalStatus : " + person.getMaritalStatus()
                        +" ]");


        }
    }
}
