
// jaba object create garda by defalut aafai call vaidinxa malually call garna pardaina(bydefault call garxa consturctor lai)
// kunai pani object create garda initial value dina pareo vanea construstor use hunxa
//implicite typecasting ani explicit typecasting

// //constrctors in java
// class Box{
//     double width;
//     double height;
//     double depth;
//     Box(){
//         System.out.println("Constructing Box");
//         depth=10;
//         width=10;
//         height=10;
//     }
//     double volume(){
//         return width*height*depth;
//     }
// }
//     public class New{
//         public static void main(String args[]) {
//             Box myBox1=new Box();
//             Box myBox2=new Box();
//             double vol;
//             vol=myBox1.volume();
//                 System.out.println("Volume is:"+vol);
            
//             vol=myBox2.volume();
//                 System.out.println("Volume is:"+vol);
//             }
        
//         }

//constructor parameter
// class Box{
//     double width;
//     double height;      //primitive datatype
//     double depth;
//     Box(double w, double h, double d){   //constructor parameter
//         this.width=w;       //(this is a keyboard: yai class object ko varaible kai refrence dinxa (yo refrence garna lai use hunxa))
//         this.height=h;           //instance varaiable 6 wota xan yesma class ra constructor ma define xa
//         this.depth=d;
//     }
//     double volume(){
//         return width*height*depth;
//     } 
// }
// public class hello{
//     public static void main(String[] args){
//         Box mybox1= new Box(10,20,15);  // box is a constructor method
//         Box mybox2= new Box(3,6,9);     //mybox1 and mybox2 is a object here
//         double vol;
//         vol=mybox1.volume();
//         {
//         System.out.println("Volume is: "+vol);
//         vol=mybox2.volume();{
//         System.out.println("Volume is:"+vol);
//         }
//     }
//     }
// }

//bydefault oject create gareo vanea 
//object lai initialize garni kaam garxa

//garvage collection: when a application is crteated where the object and varable are created tesma object vako memomory locatuon lai destory garni  (java ma hunxa yo )

//MEthod overloading
// class OverloadDemo{
//     void test(){
//         System.out.println("no parameters");
//     }
//     void test(int a){
//         System.out.println("a:"+a);
//     }

// void test(int a, int b){
//     System.out.println("a and b is:"+a+""+b);
// }
// double test(double a){
//     System.out.println("Double a:"+a);
//     return a*a;

// }
// }
// public class hello{
//     public static void main(String args[]) {
//         OverloadDemo ob=new OverloadDemo();
//         ob.test();
//         ob.test(10);
//         ob.test(10,20);
//         double result;
//         result=ob.test(123.25);
//         System.out.println("Result of ob test(123.25)"+result);
//         System.out.println("Hehe");

//     }
//parameteriased constructor
// }
// class Box{
//     double width;
//     double height;
//     double depth;
//     Box(double w, double h, double d){
//         width=w;
//         height=h;
//         depth=d;
//     }
//     double volume(){
//         return width*height*depth;
//     }
// }
// public class oop prameterized constrctor{
//     public static void main(String[] args){
//         Box mybox1= new Box(10,20,15);
//         Box mybox2= new Box(3,6,9);
//         double vol;
//         vol=mybox1.volume();
//         System.out.println("Volume is: "+vol);
//         vol=mybox2.volume();
//         System.out.println("Volume is:"+vol);
//     }
// }
