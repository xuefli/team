package com.yyy.feature1;
import com.xxx.feature1.xxx-feature1-api;
import com.xxx.feature1.xxx-feature2-api;

public class yyyy-feature1-service implements yyy-feature1-api {
  @Autowired;
  private xxx-feature1-api xxxFeature1;
  @Autowired;
  private xxx-feature2-api xxxFeature2;

  @Override
  public List<String> split(String content) {
    String[] splits = content.split("|");
    return Arrays.toList(splits);
  }
}