package com.kotlin.kotlinboot.abstractclass;

import java.util.HashMap;

public class CouponCollector {

    public static int collectAllTypes(int[] coupons) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int totalTypes = 0;
        int i = 0;

        // 사람별로 쿠폰 수집을 계속하면서 모든 유형을 수집할 때까지 반복
        while (totalTypes < 4) {  // 4는 쿠폰의 총 유형 수
            if (!map.containsKey(coupons[i])) {
                map.put(coupons[i], 1);
                totalTypes++;
            } else {
                map.put(coupons[i], map.get(coupons[i]) + 1);
            }
            i++;
        }

        return i; // 필요한 쿠폰 수 반환
    }

    public static void main(String[] args) {
        int[] customer1 = {1, 3, 3, 2, 4, 3, 3, 2, 4, 2, 4};
        System.out.println("Customer 1 needs " + collectAllTypes(customer1) + " coupons.");

        // 다른 ID에 대한 테스트 케이스도 추가 가능
    }
}