public class StaticAndInstance {

}
/*static 접근 제어자는 공통의, 클래스의, 라는 의미를 갖는다.
 * static과 instance의 차이는
 * static은 인스턴스 멤버를 사용할 수 없다.
 * 이유는 static의 위치 instance의 위치가 틀리다.
 * instance안에 static이 있고
 * static 있는 경우 instance가 없을 수 있다.
 * 이는 즉 static은 클래스가 생성되는 공간에 존재하고
 * instance는 클래스가 로드된 이후에 수동적으로 ? 값이 생성된다.
 * static은 한번 초기화가 되며 인스턴스 멤버는 인스턴스화가 될때마다 초기화가 된다.*/






// 클래스멤버와 인스턴스멤버의 차이를 보자.
class Static{


    //인스턴스 변수 (멤버변수)를 만든다.
    int modelNumber ;
    String modelName;
    static int OrModelNumber;
    static String OrModelName;



    //static 메서드 option을 만들었고 이안에선 인스턴스 멤버변수를 사용할 수 없다.
    //왜냐하면 저장되는 위치가 틀리고 static이 선언될때 인스턴스가 있을지 없을지 모르기 때문이다.
    static void option(){
        System.out.println("아반떼 기본 옵션 입니다.");


        //오류!!
/*      System.out.println(modelName);
        System.out.println(modelNumber);.*/


        /*이유는 인스턴스 멤버가 존재하는 시점에 클래스 멤버는 항상 존재하지만, 클래스멤버가 존재하는 시점에 인스턴스 멤버가
         * 존재하지 않을 수도 있기 때문이다.*/


        //1번. 오류를 해결하기 위해 인스턴스객체를 만든다.
/*        Static s2 = new Static();
        System.out.println(s2.modelName);
        System.out.println(s2.modelNumber);*/


        //2번. static 변수를 만들어 준다. 나는 2번 선택
        //이유... static 을 사용할건데 인스턴스변수를 사용할 것이라면 static을 사용할 이유가 없다.
        OrModelName = "아반떼 깡통";
        OrModelNumber = 1;
        System.out.println(OrModelName);
        System.out.println(OrModelNumber);

    }
    void optionUp(){
        System.out.println("아반떼 옵션이 업그레이드 되었습니다.");
        System.out.println(modelName);
        System.out.println(modelNumber);
    }



    //메인메서드 확인.
    public static void main(String[] args) {

        //기본 옵션 생성

        option();


        //메인 메서드도 static이기에 객체가 필요하다.

        Static s1 = new Static();


        s1.modelName = "아반떼";
        s1.modelNumber = 4;
        s1.optionUp();

    }
}