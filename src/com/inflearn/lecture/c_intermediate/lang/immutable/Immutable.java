package com.inflearn.lecture.c_intermediate.lang.immutable;

public class Immutable {
    public static void main(String[] args) {
        /*
        *
        * 불변 객체(클래스)란 ?
        *   - 객체 내부의 값, 필드, 맴버 변수가 고정된 객체
        *
        * 불변 객체 생성 방법
        *   - 키워드 final 사용
        *   - set 메서드 제거
        *
        * 불변 객체의 필요성
        *   - 한 객체가 여러 변수에서 참조되어 수정 방지
        *   - 한 객체에 대한 가독성 상승
        *
        * 불변 객체가 필요한 원인
        *   - 자바 변수 타입은 기본형, 참조형으로 나뉜다
        *   - 기본형: 같은 값을 다른 메모리 공간에 넣는다.
        *   - 참조형: 같은 참조값을 다른 메모리 공간에 넣는다.
        *       - 참조값을 공유하기 때문에 여러 변수에서 조회 & 수정이 가능
        *       - 공유 참조되는 객체를 수정하면 객체가 어떻게 수정되는지 파악이 어려움
        *
        * 불변 객체 사용 관례
        *   - 새로운 불변 객체를 반환하는 메서드는 시작을 with로 시작한다
        *
        * 불변 객체 사용 사례
        *   - String 클래스는 불변 객체
        *   - 캐시 안정성
        *   - 멀티 쓰레드 안정성
        *   - 엔티티의 값 타입
        *
        * */
        int a = 10;  // 기본형 변수
        System.out.println("a = " + a);
        int b = 10; // 기본형 변수
        System.out.println("b = " + b);

        ImmutableObject ImmutableObj = new ImmutableObject("이름", 10); // 참조형 변수
        System.out.println(ImmutableObj.getNumber()); // 10
        System.out.println(ImmutableObj); // 기존 참조값: 3f99bd52

        ImmutableObject newImmutableObj = ImmutableObj.add(10); // 불변 객체 인스턴스 변수 수정

        System.out.println(newImmutableObj.getNumber()); // 20
        System.out.println(newImmutableObj); // 새로운 참조값: 4f023edb

        ImmutableObject newObj = ImmutableObj.withName("이름 변경"); // 새로운 불변 객체 생성 시 메서드 이름을 with로 시작
        System.out.println(ImmutableObj.getName()); // 기존 객체
        System.out.println(newObj.getName()); // 새로운 불변 객체 생성

        /*
        *
        * */
        sideEffect();
    }

    public static void sideEffect() {

    }
}
