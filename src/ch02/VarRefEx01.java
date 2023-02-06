package ch02;

//new가 되어서 힙에 할당이 될 때 사이즈를 알 수있다 (프로그램이 시행되었을 때, = Runtime)
class MyData{
    int id = 1; // 4Byte
    int price = 1000; // 4Byte
}
//레퍼런스(참조) 변수, 일반 변수
public class VarRefEx01 {
    public static void main(String[] args) {
        // 타입 변수; int num; 변수를 선언한다
        // 타입 변수 = 값; int num = 10l 변수를 초기화(메모리에 할당)한다.
        int num = 10; // 일반변수 (크기가 정해져 있는 것)
        MyData d = new MyData(); // 레퍼런스 변수 (크기가 정해져 있지 않은 것)

        System.out.println(num);
        System.out.println(d.id);
        System.out.println(d.price);


    }
}
