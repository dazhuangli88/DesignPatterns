package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 女性标准
 *
 * @Author 富贵
 * @Date 2023/10/27 14:01
 * @Version 1.0
 */
public class CriteriaFemale implements Criteria{

    /**
     * 过滤符合为女性的用户列表
     *
     * @param persons
     * @return
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for(Person person : persons){
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
