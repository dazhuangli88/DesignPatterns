package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 单身标准
 *
 * @Author 富贵
 * @Date 2023/10/27 14:06
 * @Version 1.0
 */
public class CriteriaSingle implements Criteria{
    /**
     * 过滤符合为单身的用户列表
     * @param persons
     * @return
     */

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
    }

