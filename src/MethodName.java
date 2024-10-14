package src;

public class MethodName {

//  methodoverloadind - przeciążenie metod


    public  void add(int a, int b){
        System.out.println(a +b);
    }

    public  void add(int a, int b, int c){
        System.out.println(a +b + c);
    }
    public  void add(String a){
        System.out.println(a);
    }
    public  void add(){
        System.out.println(2+2);
    }

}
