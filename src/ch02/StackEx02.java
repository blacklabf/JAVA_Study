package ch02;

public class StackEx02 {

/*
정리 : Stack(지역변수 = 메서드가 실행될 때 메모리에 할당 = 메서드가 종료될 때 메모리에서 사라짐)
    : Heap(전역변수 = new할때 메모리에 할당됨 = 더 이상 참조하지 않을 때 메모리에서 사라짐)
    : Static(전역변수 = main메서드가 실행되기 전에 메모리에 할당 = main메서드가 종료되면 메모리에서 사라짐)
 */

    static int sum = 20; // 전역변수(Static) : main메서드가시작되기 전에 sum이 할당된다. // class 내부에 있음, 전역변수 (외부에서 접근 가능) -> main 내부에서 호출 가능
    int value = 50; // 전역변수(heap) : 더 이상 참조하지 않을 때 자동으로 사라진다. // 이렇게만 하면 메모리에 뜨지 않아서 main 내부에서 sout(value) 하면 불가능 -> main 내부에서 메모리에 띄우기

    static void a(){ //method 생성 : 괄호가 있음
        // a메서드가 실행될 때 stack공간에 n1이 할당되고 a메서드가 종료되면 메모리에 사라진다.
        int n1 = 1; // 지역변수(Stack) // a 메서드의 stack 영역에 저장됨(지역변수:외부에서접근불가) -> 아랫줄에서 sout됨, main내부에서는 실행되지 않음.
        System.out.println(n1);

        // 20번 라인이 실행되려고 할 때 static 공간에 할당해야 하는데 불가능 : static 공간 할당은 main메서드 실행전에만 가능
        // static int n3 = 2; 오류가 생김

    }

    public static void main(String[] args) {
        a(); // 메서드를 호출한다.
        // System.out.println(n1); // a메서드의 stack영역에 저장되기 때문에 n1이 호출되지 않음.
        System.out.println(sum); // sum은 전역변수여서 접근 가능
        // System.out.println(value); // value 앞에 static이 없어서 메모리에 뜨지 않음 -> 아랫줄 처럼 해서 메모리에 띄워줘야 함.
        StackEx02 s = new StackEx02(); // new를 하면 class 내부에 static이 아닌 모든게 heap 영역에 뜨는데 이때에는 value만 뜸
        System.out.println(s.value); // s연산자.value를 통해 호출할 수 있음
        System.out.println("test1-더이상 s변수를 참조하지 않기 때문에 메모리에서 자동을 사라진다.");
    }
}
