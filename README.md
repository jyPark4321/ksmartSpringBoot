# ksmartSpringBoot
한국스마트정보교육원 51기 스프링부트 훈련 내용을 정리하는 리포지토리입니다.

  

## 2024년 6월 5일 훈련 요약(스프링부트)
 

1.오전수업
> 수업내용 : 웹 어플리케이션 구조, 스프링부트 초기 개발 환경 세팅 

2.오후수업
> 설명: 


## 2024년 6월 7일 훈련 요약(스프링부트)


1.오전수업
> 수업내용 : 스프링부트 프로젝트 구조, <br> 
>           exam1 간단한 페이지 이동 실습,

2.오후수업
> 설명: 1.thymeleaf 객체 바인딩 <br>
>       2.thymeleaf 객체 속성 바인딩 <br>
>       3.thymeleaf 주석 처리 방법 <br>
>       4.이스케이프 vs 언이스케이프 <br>

## 2024년 6월 13일 훈련 요약(스프링부트)


1.오전수업
> 수업내용 : thymeleaf 반복문, 조건문, 객체바인딩, 변수선언하는방법 , 실습문제

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <link rel="stylesheet" href="/css/table.css">
    <meta charset="UTF-8">
    <title>실습문제</title>
</head>
<body>
<h4>실습문제</h4>
-1: talbe.css 외부스타일을 적용 <br>
-2: https://localhost/exam/exam4 -> exam4.html 동적인페이지 노출 <br>
-3: memberList 객체를 이용해서 table 생성 <br>
-4: memberList 객체가 없을시에 '등록된 회원의 정보가 없습니다.' 행이 노출 <br>
-5: target 변수를 선언하고 id003 회원의 정보(객체)를 할당 <br>
5-1 : service 계층 getMemberInfoById("id003")
: memberId="id003",memberPw="pw003",memberLevel="구매자",memberName="홍03",memberMobile="010-3333-3333"<br>
5-2 : th:object 활용해서 target변수에 memberId를 할당 <br>
-6: 회원의 목록중 id003에 일치하는 행 전체를 빨간색 폰트로 화면에 노출 <br>
<table th:object="${memberInfo}">
    <thead>
    <tr>
        <th>회원아이디</th>
        <th>회원비밀번호</th>
        <th>회원등급</th>
        <th>회원이름</th>
        <th>회원연락처</th>
    </tr>
    </thead>
    <tbody th:with="target=*{memberId}">
    <th:block th:if="${memberList != null}" th:each="l:${memberList}">
        <tr th:style="${(l.memberId == target) ? 'color : red' : ''}">
            <td th:text="${l.memberId}"></td>
            <td th:text="${l.memberPw}"></td>
            <td th:text="${l.memberLevel}"></td>
            <td th:text="${l.memberName}"></td>
            <td th:text="${l.memberMobile}"></td>
        </tr>
    </th:block>
    <tr th:unless="${memberList != null}">
        <td colspan="5">등록된 회원의 정보가 없습니다.</td>
    </tr>
    </tbody>
</table>
</body>
</html>

```html
전체 코드
<table th:object="${memberInfo}">
    <thead>
    <tr>
        <th>회원아이디</th>
        <th>회원비밀번호</th>
        <th>회원등급</th>
        <th>회원이름</th>
        <th>회원연락처</th>
    </tr>
    </thead>
    <tbody th:with="target=*{memberId}">
    <th:block th:if="${memberList != null}" th:each="l:${memberList}">
        <tr th:style="${(l.memberId == target) ? 'color : red' : ''}">
            <td th:text="${l.memberId}"></td>
            <td th:text="${l.memberPw}"></td>
            <td th:text="${l.memberLevel}"></td>
            <td th:text="${l.memberName}"></td>
            <td th:text="${l.memberMobile}"></td>
        </tr>
    </th:block>
    <tr th:unless="${memberList != null}">
        <td colspan="5">등록된 회원의 정보가 없습니다.</td>
    </tr>
    </tbody>
</table>
```

2.오후수업
> 수업내용 : 링크표현, 유틸리티오브젝트


## 2024년 6월 14일 훈련 요약(스프링부트)


1.오전수업
> 수업내용 : Maven프로젝트에서 pom.xml이란?
>            thymeleaf-layout-dialect 종속성추가하기

2.오후수업
> 설명: 