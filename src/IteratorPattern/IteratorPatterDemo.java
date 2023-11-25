package IteratorPattern;

/**
 * @Author 富贵
 * @Date 2023/10/25 18:36
 * @Version 1.0
 */
public class IteratorPatterDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
       for(Iterator iter = nameRepository.getIterator(); iter.hasNext();){
           String name = (String)iter.next();
           System.out.println("Name :" +name);
       }

    }
}
