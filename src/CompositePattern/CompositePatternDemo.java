package CompositePattern;

/**
 * @Author 富贵
 * @Date 2023/10/27 16:03
 * @Version 1.0
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        //ceo
        Employee CEO = new Employee("Tom","CEO",30000);
        //首席销售
        Employee headSales = new Employee("jake","Head Sales",15000);
        //办事员
        Employee Clerk = new Employee("lily","Marketing",10000);
        //销售执行人
        Employee salesExecutive = new Employee("alice","sales",9000);
        //CEO添加下属
        CEO.add(headSales);
        //首席添加下属
        headSales.add(Clerk);

        //打印该组织所有员工
        System.out.println(CEO);
        for(Employee headEmployee : CEO.getSubordinates()){
            System.out.println(headEmployee);
            for(Employee employee : headEmployee.getSubordinates()){
                System.out.println(employee);
            }
        }

    }
}
