package com.example.worship.test;

import com.example.worship.test.common.Whens;
import java.util.List;

public class WorshipPlay implements 예배{

  public void 주일예배(형식DTO 양식){
    System.out.println("----------예배------------");
    찬양(양식.get찬양곡(),양식.get찬양종류());
    if(양식.get대표기도자()!=null){
      System.out.print("기도자 : "+양식.get대표기도자()+" / ");
    }
    기도(양식.get기도종류().get(0));
    성경봉독(양식.get성경구절());
    말씀(양식.get말씀(),양식.get설교자());
    System.out.print("기도자 : " +양식.get설교자()+" / ");
    기도(양식.get기도종류().get(1));
    광고(양식.get광고리스트());
  }

  public void 수요예배(형식DTO 양식){
    System.out.println("----------예배------------");
    찬양(양식.get찬양곡(),양식.get찬양종류());
    System.out.print("기도자 : "+양식.get대표기도자()+" / ");
    기도(양식.get기도종류().get(0));
    성경봉독(양식.get성경구절());
    말씀(양식.get말씀(),양식.get설교자());
    광고(양식.get광고리스트());
  }

  public void 새벽예배(형식DTO 양식){
    System.out.println("----------예배------------");
    찬양(양식.get찬양곡(),양식.get찬양종류());
    말씀(양식.get말씀(),양식.get설교자());
    기도(양식.get기도종류().get(0));
  }


  @Override
  public void 말씀(String 말씀, String 설교자) {
    System.out.println(설교자+"의 "+말씀);
  }

  @Override
  public void 찬양(List<String> 찬양곡, String 찬양종류) {
    찬양곡.forEach(s -> System.out.print(s+" "));
    System.out.println();
  }

  @Override
  public void 기도(String 기도종류) {
    System.out.println(기도종류);
  }

  @Override
  public void 성경봉독(String 성경구절) {
    System.out.println(성경구절+":봉독");
  }

  @Override
  public void 광고(List<String> 광고리스트) {
    광고리스트.forEach(s -> System.out.print(s+" "));
    System.out.println();
  }
}
