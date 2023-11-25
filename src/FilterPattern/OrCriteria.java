package FilterPattern;

import java.util.List;

/**
 * or 条件
 *
 * @Author 富贵
 * @Date 2023/10/27 14:26
 * @Version 1.0
 */
public class OrCriteria implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria,Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    /**
     * 符合 OR条件的后续处理
     *
     * @param persons
     * @return
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        //根据自身条件进行过滤
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);
        //*** 取两个过滤结果的，将otherCriteriaItems
        // 不含有的对象放入到firstCriteriaItems
        for(Person person : otherCriteriaItems){
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;

    }
}
