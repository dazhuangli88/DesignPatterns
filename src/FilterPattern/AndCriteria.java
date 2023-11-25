package FilterPattern;

import java.util.List;

/**
 * And 条件
 *
 * @Author 富贵
 * @Date 2023/10/27 14:13
 * @Version 1.0
 */
public class AndCriteria implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public  AndCriteria(Criteria criteria,Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    /**
     * *** AND 条件的后续处理
     *
     * @param persons
     * @return
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        //先根据第一个条件进行过滤
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        //根据第二个条件进行过滤
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
