/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework4;

/**
 * 定义一个类实现银行帐户的概念，其属性有“帐号”和“存款余额”，
 * 方法有“存款”、“取款”、“查询余额”和“显示帐号”。
 * 再定义主类，创建帐户类的对象，并完成相应操作。
 * @author kjx33
 */
class BankAccount{
    double username;
    int leftMoney;
    public void setBankAccount(double a,int b){
        this.username = a;
        this.leftMoney = b;
    }
    public int getLeftMoney() {//查询余额
        return leftMoney;
    }
    public void saveMoney(double money) {//存款
        leftMoney+=money;
    }
    public void getMoney(double money) {//取款
        if (money<=leftMoney)
            leftMoney-=money;
        else
            System.out.println("只能取："+leftMoney);
    }
    public void showUserName(){
        System.out.println(username);
    }
}

public class HomeWork4 {
    public static void main(String[] args) {
    BankAccount ba=new BankAccount();
    ba.setBankAccount (888123,1000);  //开户
    ba.saveMoney(21000);
    System.out.println("存入21000元后余额为："+ba.getLeftMoney());
    ba.getMoney(11500);
    System.out.println("取出11500元后余额为："+ba.getLeftMoney());

    }
    
}
