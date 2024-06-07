package ksmart.springboot.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ksmart.springboot.exam.dto.Member;

/**
 * @Service : 비즈니스 로직 수행, 기능구현, data 가공
 * 			(트랜잭션 : 논리적인 작업을 수행하는 한단위)
 * 			bean의 이름 : ExamService - > examService
 */
@Service
public class ExamService {

    public ExamService() {
        System.out.println("객체생성");
    }

    public List<Member> getMemberList(){

        //Member id001~ id009 arrayList 만들어보세요
        List<Member> memberList =new ArrayList<>();
        String[] levelList = new String[]{"관리자","판매자","구매자"};
        Member member = null;
        for(int i=1; i<10;i++) {
            String memberId = "id00" +i;
            String memberPw = "pw00" +i;
            String memberLevel = levelList[(i-1)% levelList.length];
            String memberName = "홍00" +i;
            String memberMobile = "010- "+i+i+i+i+"-"+i+i+i+i;
            member = new Member(memberId,memberPw,memberLevel,memberName,memberMobile);
            memberList.add(member);
        }
        return memberList;
    }

	/*
	public void payOrder(String memberId, Goods goods, Order order,Paymenet pay) {
		//1. 주문 내역확인 상품 재고 확인

		//2. 주문 내역 결제금액 충분?

		//3. 상품 재고 업데이트

		//4. 주문 주문이력추가

	}
	*/
}