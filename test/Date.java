/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kjx33
 */
public class Date {
    int year,month,day;
    Date(int NewYear,int NewMonth,int NewDay){
        this.day = NewDay;
        this.month = NewMonth;
        this.year = NewYear;
    }
    void Judge(){
        if(this.year == (this.year/4)*4){
            System.out.println("今年是闰年");
        }else{
            System.out.println("今年不是闰年");
        }
    }
    void PrintDate(){
        System.out.println("日期为： "+ year +"年"+ month + "月" + day + "日");
    }
}
