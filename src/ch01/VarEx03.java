package ch01;

//MyVar : 클래스 자료형 = 개발자가 만드는 커스텀 자료형
//여러가지 데이터를 가지고 있는 클래스를 Beans 라고 부름.
class MyVar{
    static int n1 = 10;
    static char c1 = 'A';

}

public class VarEx03 {

    static int num = 500;

    public static void main(String[] args) {
        System.out.println(MyVar.n1);
        System.out.println(MyVar.c1);
        System.out.println(num); // 엄밀하게는 VarEx03.num 이라고 적어줘야 함(main이랑 같은 공간에 있어서 안 적어준 거)

    }
}
