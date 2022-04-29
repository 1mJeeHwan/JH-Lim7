package com.example.worship;


import com.example.worship.test.Check;
import com.example.worship.test.형식DTO;
import java.util.ArrayList;
import java.util.List;


public class WorshipApplication {
  private static List<String> 찬양곡 = new ArrayList<>();
  private static List<String> 기도종류 = new ArrayList<>();
  private static List<String> 광고리스트 = new ArrayList<>();


  public static void main(String[] args){
    Check check = new Check();
    새벽(check);
    수요(check);
    주일(check);
  }

  public static void 초기화(){
    찬양곡 = new ArrayList<>();
    기도종류 = new ArrayList<>();
    광고리스트 = new ArrayList<>();
  }
  public static void 새벽(Check check){
    초기화();
    찬양곡.add("찬양1");
    찬양곡.add("찬양2");
    찬양곡.add("찬양3");
    기도종류.add("새벽합심");
    형식DTO 양식 = 형식DTO.builder()
        .찬양종류("준비찬양")
        .찬양곡(찬양곡)
        .설교자("목사님")
        .말씀("새벽말씀")
        .기도종류(기도종류)
        .build();
    check.checkDay("새벽",양식);
  }
  public static void 수요(Check check){
    초기화();
    찬양곡.add("찬양1");
    찬양곡.add("찬양2");
    찬양곡.add("찬양3");
    기도종류.add("대표기도");
    광고리스트.add("광고1");
    광고리스트.add("광고2");
    형식DTO 양식 = 형식DTO.builder()
        .찬양종류("준비찬양")
        .찬양곡(찬양곡)
        .설교자("목사님")
        .말씀("수요말씀")
        .기도종류(기도종류)
        .성경구절("성경구절")
        .광고리스트(광고리스트)
        .대표기도자("사회자")
        .build();
    check.checkDay("수요",양식);
  }

  public static void 주일(Check check){
    초기화();
    찬양곡.add("찬양1");
    찬양곡.add("찬양2");
    찬양곡.add("찬양3");
    기도종류.add("대표기도");
    기도종류.add("축도");
    광고리스트.add("광고1");
    광고리스트.add("광고2");
    형식DTO 양식 = 형식DTO.builder()
        .찬양종류("준비찬양")
        .찬양곡(찬양곡)
        .설교자("목사님")
        .말씀("주일말씀")
        .기도종류(기도종류)
        .성경구절("성경구절")
        .광고리스트(광고리스트)
        .대표기도자("대표기도자")
        .build();
    check.checkDay("주일",양식);
  }
}
