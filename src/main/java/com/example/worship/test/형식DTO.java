package com.example.worship.test;

import java.util.List;
import lombok.*;

@Getter
@Setter
@Builder
public class 형식DTO {
  private List<String> 싱어;
  private String 설교자;
  private String 찬양종류;
  private List<String> 기도종류;
  private String 성경구절;
  private List<String> 찬양곡;
  private List<String> 광고리스트;
  private String 말씀;
  private String 대표기도자;
}
