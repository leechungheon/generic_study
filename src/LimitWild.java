import java.util.Arrays;
import java.util.List;
//Upper Bounded Wildcard
public class LimitWild {
    public static double sumOfList(List<? extends Number> list){
        // Number 클래스의 자손 클래스들을 와일드 카드로 표시
        // Integer가 Number클래스로부터 상속받음.
        double s=0.0;
        for(Number n:list)
            s+=n.doubleValue();//Number 클래스의 자손클래스
        return s;
    }

    public static void main(String[] args) {
        List<Integer>li= Arrays.asList(1,2,3);
        System.out.println("sum = "+ sumOfList(li));
    }
}