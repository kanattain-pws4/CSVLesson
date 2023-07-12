package model;

import java.io.Serializable;

public class Sales implements Serializable{
  private String year;
  private String salesA;
  private String salesB;
  private String salesC;
  private String salesD;
  public Sales(){}
  public Sales(String year,String salesA,String salesB,String salesC,String salesD){
    this.year=year;
    this.salesA=salesA;
    this.salesB=salesB;
    this.salesC=salesC;
    this.salesD=salesD;
  }

  public String getYear() {
    return year;
}
public void setYear(String year) {
    this.year = year;
}
public String getSalesA() {
    return salesA;
}
public void setSalesA(String salesA) {
    this.salesA = salesA;
}
public String getSalesB() {
    return salesB;
}
public void setSalesB(String salesB) {
    this.salesB = salesB;
}
public String getSalesC() {
    return salesC;
}
public void setSalesC(String salesC) {
    this.salesC = salesB;
}
public String getSalesD() {
    return salesD;
}
public void setSalesD(String salesD) {
    this.salesD = salesD;
}
}
