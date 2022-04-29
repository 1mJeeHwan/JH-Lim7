package com.example.worship.test;

import java.util.List;

public interface 예배 {

  public void 말씀(String 말씀, String 설교자);
  public void 찬양(List<String> 찬양곡,String 찬양종류);
  public void 기도(String 기도종류);


  public default void 성경봉독(String 성경구절){
    System.out.println(성경구절+" 봉독하겠습니다.");
  };
  public default void 광고(List<String> 광고리스트){
    광고리스트.forEach(s -> System.out.println(s));
  };

}
