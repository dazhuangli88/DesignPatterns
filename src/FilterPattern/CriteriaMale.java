package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 男性标准
 *
 * @Author 富贵
 * @Date 2023/10/27 13:53
 * @Version 1.0
 */
public class CriteriaMale implements Criteria{

    /**
     * 过滤符合为男性的用户列表
     *
     * @param persons
     * @return
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for(Person person : persons){
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
