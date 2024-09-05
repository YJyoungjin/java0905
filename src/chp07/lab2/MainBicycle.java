package chp07.lab2;

public class MainBicycle {
    public static void main(String[] args){
        Bicycle b1=new Bicycle();
        b1.name="따릉";
        b1.weight= 17.76;
        b1.price= 142000;

        System.out.printf("%s인 자전거의 무게는 %f이고 가격은 %d다.",b1.name,b1.weight,b1.price);
    }
}
