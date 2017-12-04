package arraylist;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        
        ArrayList list = new ArrayList(10); // 기본 길이가 10인 객체 배열
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("222"); // list는 중복요소 추가가능
        list.add(333); // list.add(new Integer(333)); 오토박싱
        
        System.out.println(list);
        
        list.add(0, "000"); // 0번째 위치에 "000"을 저장
        System.out.println(list);
        
        System.out.println(list.indexOf("333")); // "333"이 저장된 위치를 알려줌
        
        list.remove("333"); // "333"을 삭제
        System.out.println(list);
        System.out.println(list.remove("333")); // 삭제성공하면 true, 실패하면 false
        System.out.println(list.indexOf("333")); // -1의 결과는 지정된 객체를 찾을수 없음
        
        for (int i = 0; i < list.size(); i++) {
            list.set(i, i + ""); // set 메서드는 지정된 인덱스에 위치한 객체를 다른 객체로 변경
        }
        System.out.println(list);
        
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", "); // get 메서드는 지정된 인덱스의 객체를 반환
        }
        System.out.println("]");
        
        for (int i = list.size() - 1; i >= 0; i--) // 전체삭제는 배열의 끝 인덱스부터 지워나가야한다
            list.remove(i); // 앞에서부터 삭제하면 저장된 객체들이 한칸씩 이동을해서 전부 지워지지 않는다
        System.out.println(list);
        
//        list.clear();
//        System.out.println(list);
    }
    
}
