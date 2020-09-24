import java.util.Date;



public class Dates {

  

  private int day, month, year;

  

  public Dates(int day, int month, int year){

    super();

    this.day = day;

    this.month = month;

    this.year = year;

    

    Date date = null;

    

    

  }



  

  @Override

  public String toString() {

    return day+ "/" + month + "/" + year;

  }





  public int getDay() {

    return day;

  }



  

  public int getMonth() {

    return month;

  }



  

  public int getYear() {

    return year;

  }



}