package ch01;

// 메모리 : VarEx05 -> main
// 메모리 : Note -> main 없음
class Note2{ // Note2 는 커스텀 자료형 이름
    int price = 2000;
}
public class VarEx05 {
    public static void main(String[] args) {
        Note2 note1 = new Note2(); // heap 공간에 Note 클래스가 가지고 있는 모든 데이터를 할당해 (대신 Static은 제외하고!)
        Note2 note2 = new Note2(); // heap 공간에 만들어짐
        Note2 note3 = new Note2(); // heap 공간에 만들어짐
        int age = 25; // main stack 공간에 만들어짐
        System.out.println(age);
        System.out.println(note1.price);
        System.out.println(note2.price);
        System.out.println(note3.price);

        note3.price = 3000;
        System.out.println(note1.price);
        System.out.println(note2.price);
        System.out.println(note3.price);

    }
}
