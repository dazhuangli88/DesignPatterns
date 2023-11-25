package FilterPattern;

import java.util.List;

/**
 * @Author 富贵
 * @Date 2023/10/27 13:51
 * @Version 1.0
 */
public interface Criteria {
    /***
     * 满足条件后操作
     */
    public List<Person> meetCriteria(List<Person> persons);
}
