package com.example.worship.test;

import com.example.worship.test.common.Whens;

public class Check {
  WorshipPlay 진행 = new WorshipPlay();
  public void checkDay(String 요일,형식DTO 양식){
    if(요일 == Whens.SUN){
      진행.주일예배(양식);
    }
    if(요일 == Whens.WED){
      진행.수요예배(양식);
    }
    if(요일 == Whens.DAWN){
      진행.새벽예배(양식);
    }

  }

}
