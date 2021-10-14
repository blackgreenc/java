import java.util.Scanner;
import java.util.Random;


// 1번
//class Main {
//  public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    float a = in.nextFloat();
//    float b = in.nextFloat();
//
//    System.out.println(a+b);    
//    
//  }
//}


// 2번
//class Main {
//  public static void main(String[] args) {
//    int sum = 0;
//    
//    for(int i = 1; i<20; i++){
//        if(i%3 == 0 | i%2 ==0){
//            continue;
//        }
//        sum += i;
//    }
//    System.out.println("sum = " + sum);
//  }
//}


// 3번
//class Main {
//    public static void main(String[] args) {
//    int sum = 0;
//    int array[] = {10, 20, 30, 40, 50};
//    
//    for(int i = 0; i<array.length; i++){
//        
//        sum += array[i];
//    }
//    System.out.println("sum = " + sum);
//  }
//}


//4번
//class Main {
//    public static void main(String[] args) {
//    int sum = 0;
//    int totalsum = 0;
//    
//    for(int i = 0; i<=10; i++){
//        
//        sum += i;
//        totalsum += sum;
//
//    }
//    System.out.println("totalsum = " + totalsum);
//  }
//}


//5번
//class Main {
//    public static void main(String[] args) {
//    
//    Scanner in = new Scanner(System.in);
//    int num = in.nextInt();
//    int a = 0;
//    int sum = 0;
//    
//    while(num>0){
//        a = num % 10;
//        sum += a; 
//        num /= 10;
//    }
//    System.out.println("sum = " + sum);
//  }
//}


//6번
//class Main {
//    public static void main(String[] args) {
//    String str = "12345";
//    
//    int sum = 0;
//    
//    for(int i = 0; i < str.length(); i++){
//        sum += (int)str[i];
//    }
//
//    System.out.println("sum = " + sum);
//  }
//}



//7번
//class Main {
//    public static void main(String[] args) {
//    int input = 0;
//    int i = 0;
//    int random = (int)(Math.random()*10 + 1);
//    Scanner in = new Scanner(System.in);
//    while(true){
//        i++;
//        System.out.println("1과 10 사이의 값을 입력하시오 :");
//        input = in.nextInt();
//
//        if(random == input){
//            System.out.println("맞음 ㅋ \n" + i + "번 했음");
//            break;
//        }
//        else if(random < input){
//            System.out.println("더 작은 수 적어");
//        }
//        else{
//            System.out.println("더 큰 수 적어");
//        }
//    }
//  }
//}


//8번
//class Main {
//    public static void main(String[] args) {
//    int x = 1, y = 2, z = 3;
//    System.out.println("x = " + x + " y = " + y + " z = " + z);
//    int k = change(x, y, z);
//  }
//  public static int change(int x, int y, int z) {
//    int t = 0;
//    t = x;
//    x = y;
//    y = z;
//    z = t;
//    System.out.println("x = " + x + " y = " + y + " z = " + z);
//    return 0;
//  }
//}


//9번
//class Main {
//    public static void main(String[] args) {
//   float total = 0;
//   float average = 0;
//   int array[][] = {
//                {5,5,5,5,5},
//                {10,10,10,10,10}, 
//                {20,20,20,20,20}, 
//                {30,30,30,30,30}
//                };
//    for(int i = 0; i<array.length; i++){
//        for(int j = 0; j<array[i].length; j++){
//            total += array[i][j];
//            average = total/20;
//        }
//    }
//    System.out.println("total = " + (int)total);
//    System.out.println("average = " + average);
//  }
//}


//10번
//class Main {
//    public static void main(String[] args) {
//    int sum = 0;
//    int s = 1;
//    int i = 0;
//
//    while(sum < 100){
//        i++;
//        sum += i*s;
//        s *= -1;
//    }
//        
//    System.out.println("num = " + i);
//    System.out.println("sum = " + sum);
//  }
//}



//11번
//class Main {
//    public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    int value = in.nextInt();
//    int j = abs(value);
//  }
//  public static int abs(int v){
//    if(v < 0){
//        System.out.println(v +"의 절대값 " + v * -1);
//    }
//    return 0;
//  }
//}




////12번 + 13번
//public static class Dragon {
//    int attack = 20;
//    int hp = 100;
//    int attack_power(){
//        return attack;
//    }
//    public void status(int num){
//        hp-=num;
//        if(hp <= 0){
//            System.out.println("MISSION FAILED");
//        }
//    }
//}
//public static class Soldier {
//    int attack = 10;
//    int hp = 60;
//    int attack_power(){
//        return attack;
//    }
//    public void status(int num){
//        hp-=num;
//        if(hp <= 0){
//            System.out.println("MISSION FAILED");
//        }
//    }
//
//14번
//public class Main{
//    public static void(main args){
//        Dragon d1 = new Dragon();
//        Soldier s1 = new Soldier();
//    
//        d1.status(s1.attack_power());
//
//        Soldier []Soldier=new Soldier[10];
//        for(int i = 0; i < Soldier.length ;i++){
//            Soldier[i]=new Soldier();
//        }
//        for(var i: Soldier) {
//            d1.status(i.attack_power());
//        }
//         System.out.println("드래곤 hp : " + d1.hp);
//
//    }
//}
//public static class Dragon {
//    int attack = 20;
//    int hp = 100;
//      int attack_power(){
//          return attack;
//      }
//      public void status(int num){
//          hp-=num;
//          if(hp <= 0) System.out.println("MISSION FAILED");
//      }
//  }
//    public static class Soldier {
//        int attack = 10;
//        int hp = 60;
//        int attack_power(){
//        return attack;
//    }
//    public void status(int num){
//        hp-=num;
//        if(hp <= 0)System.out.println("MISSION FAILED");
//    }
//  }











//15번
//public class Main{
//    public static void main(String[] args) {
//        
//        miner m1=new miner("말런");
//        miner m2=new miner("클로리아");
//        m1.mine(3);
//        m2.mine(2);
//        m1.print();
//        m2.print();
//    }
//}
//class miner{
//    String name;
//    int coin;
//    miner(String name){
//        this.name=name;
//    }
//    void mine(int coin){
//        this.coin+=coin;
//    }
//    void print(){
//        System.out.println("이름: "+name+" 코인: "+coin);
//    }
//}


//16번
//public class Main{
//    public static void main(String[] args) {
//        Food chicken = new Food("치킨", 18000);
//        Food pizza = new Food("피자", 20000);
//        Food sushi = new Food("스시", 22000);
//
//        Food[] foods = {chicken, pizza, sushi};
//
//        for (int i = 0; i<foods.length; i++){
//            foods[i].print();
//        }
//    }
//}
//class Food {
//    String name;
//    int price;
//    Food(String name,int price){
//        this.name=name;
//        this.price=price;
//    }
//    void print(){
//        System.out.println("name: "+name+" price: "+price);
//    }
//}



//17번
//public class Main{
//    public static void main(String[] args){
//        Car c1 = new Car();
//        Car c2 = new Car("blue");
//        Car c3 = new Car("black", "auto", 9);
//        System.out.printf(" c1 : %s, %s, %d\n", c1.color, c1.gear, c1.door);
//        System.out.printf(" c2 : %s, %s, %d\n", c2.color, c2.gear, c2.door);
//        System.out.printf(" c3 : %s, %s, %d\n", c3.color, c3.gear, c3.door);
//    }
//}
//class Car {
//    String color;
//    String gear;
//    int door;
//    Car(){
//        this("white","auto",4);
//    }
//    Car(String color){
//        this(color,"auto",4);
//    }
//    Car(String color, String gear, int door){
//        this.color=color;
//        this.gear=gear;
//        this.door=door;
//    }
//}


//18번
//iclass Account {
//    private String ano;
//    private String owner;
//    private int balance;
//    Account(String ano,String owner,int balance){
//        this.ano=ano;
//        this.balance=balance;
//        this.owner=owner;
//    }
//
//    public String getAno() {
//        return ano;
//    }
//
//    public void setAno(String ano) {
//        this.ano = ano;
//    }
//
//    public String getOwner() {
//        return owner;
//    }
//
//    public void setOwner(String owner) {
//        this.owner = owner;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
//
//    public void setBalance(int balance) {
//        this.balance = balance;
//    }
//
//    public void transfer(Account target,int amount){
//        if(balance<amount){
//            System.out.println("잔액 부족");
//        }
//        else{
//            this.balance-=amount;
//            target.balance+=amount;
//        }
//    }
//}

//19번
//public class Main{
//    public static void main(String[] args){
//        //객체 생성(a, b, 2개)
//        Account  a = new Account("123-45", "안철수", 10000);
//        Account  b = new Account("567-89", "박근혜", 10000);
//
//        // 결과 출력
//        System.out.printf("%s, %s, %d \n", a.getAno(), a.getOwner(), a.getBalance());
//        System.out.printf("%s, %s, %d \n\n", b.getAno(), b.getOwner(), b.getBalance());
//        //a 계좌에서 -> b 계좌로 3000원 송금
//        a.transfer(b,b.getBalance());
//        // 결과 출력
//        System.out.printf("%s, %s, %d \n", a.getAno(), a.getOwner(), a.getBalance());
//        System.out.printf("%s, %s, %d \n", b.getAno(), b.getOwner(), b.getBalance());
//
//
//   }
//}



//20번
