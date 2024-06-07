package ksmart.springboot.exam.service;

import ksmart.springboot.exam.dto.Member;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Service : 비즈니스 로직 수행, 기능구현, data 가공
 *            (트랜잭션 : 논리적인 작업을 수행하는 한 단위)
 */
@Service
public class ExamService {

    public ExamService() {
        System.out.println("객체생성 ");
    }

    public List<Member> getmemberList(){
        // Member id001~id009까지 arrayList 만들어보세요.
        // id001 관리자 id002 판매자 id003 구매자
        List<Member> memberList = new ArrayList<Member>();
        Member member = null;
        for(int i = 0; i<10; i++){
            String memberId = "id00"+i;
            String memberPw = "pw00"+i;
            String memberName = "홍0"+i;
            String memberLevel = "";
            int num = i % 3;
            if(num == 0){
                memberLevel = "관리자";
            } else if(num == 1){
                memberLevel = "판매자";
            } else {
                memberLevel = "구매자";
            }
            String memberMobile = "010-"+i+i+i+i+"-"+i+i+i+i;
            member = new Member(memberId,memberPw,memberName,memberLevel,memberMobile);
            memberList.add(member);
        }
        return memberList;
    }
    /*
    public void payOrder(String memberId, Goods goods, Order order, Payment pay){
        //1. 주문 내역확인 상품 재고 확인
        //2. 주문 내역 결재 금액 충분
        //3. 상품 재고 업데이트
        //4. 주문 테이블에 주문 이력 추가
    }
    */

}
