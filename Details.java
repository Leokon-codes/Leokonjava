// package LeokonJAVA;

// public class Details {
//     public static void main(String args[]){
        // System.out.println("Future Developer: Khagendra Raj Subedi");
        // System.out.println("Age:20");
        // System.out.println("Address:Banasthali, Kathmandu");
        // System.out.println("Phone:9742449222");
        // System.out.println("Studies:Currently studing BCA");




        // int a=20;
        // int b=30;
        // int sum;
        // sum=a+b;
        // System.out.println(sum);



        // int a=2;
        // if(a%2==0){
        //     System.out.println("it is even number");
        // }
        // else{
        //     System.out.println("It is odd number");
        // }



    //     int n=4;
    //     int i;
    //     int count =0;
    //     for(i=2;i<=n/2;i++)
    //     {
    //         if(n%i==0){
    //             count++;
    //         }
       
    // }
    // if(count==0){
    //     System.out.println("It is prime number");
    // }
    // else{
    //     System.out.println("It is not prime number");
    // }
//     }
// }

// import java.lang.*;
// class Details{
//     // class first{
//     //     1. this line uses the keyword class to declare a new class
//     //     2. first is an identifier that is the name of class
//     //     3. the entire class definition including all of its member with in {}
//     import java.lang.*;
// //     import java.lang.*;
// // 1. lang is package which means language package
// // 2. it is one of the build in package in java
// // 3. it is just line library in c&c++
// // 4. it is auto imported of not imported by the developers
//     public static void main(String args[]){
// //         Public static void main(String args[])
// // 1. this line begins the main() methods
// // 2. this is the line at which the program will begin executing
// // 3. all java applications begin execution by calling main() method.
// // 4. The public keyboard is an access modifier which allows the programmers to control the visibility of the class members
// // 5. when a class member is proceeded by public then that member may be accessed by code outside the  class
// // 6. in this case main() must be declared as public, since it must called by code outside of its class when the program is stared. 

//     System.out.println("Hello developers");
//     }
    
// }
// import java.util.*;
// class Details{
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the number:");
//     int x=sc.nextInt();
//     int sum=0;
//     while (x!=0) {
//         sum += x % 10;
//         x /=10;
        
//     }
//     System.out.println("the sum is: "+sum);
// }}

// import java.util.*;
// class Details{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number:");
//         int num= sc.nextInt();
//         int count = 0;
//         for(int i=2;i*i<=num;i++){
//             if(num%i==0){
//                 count ++;
//             }
//         }
//         if(count==0){
//             System.out.println("It is prime number");
//         }
//         else{
//             System.out.println("It is not a prime number");
//         }
        
//     }
// }

// import java.util.*;
// public class Details{
//     public static void main(){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int j=1;
//         int num= sc.nextInt();
//         for(int i=1;i<=num;i++){
//             j=j*i;
//         }
//         System.out.println("Factorail is: "+j);
//     }
    
// }

// import java.util.*;
// public class Details{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number:");
//         int a = sc.nextInt();

//         System.out.println("Enter the second number:");
//         int b = sc.nextInt();

//         int hcf = calculate(a, b);
//         System.out.println("Hcf of " + a + " and " + b + " is " + hcf);
//     }

//     public static int calculate(int a, int b) {
//         if (a < b) {
//             int temp = a;
//             a = b;
//             b = temp;
//         }
//         while (b != 0) {
//             int remainder = a % b;
//             a = b;
//             b = remainder;
//         }
//         return a;
//     }
// }

// import java.util.*;
// public class Details{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number:");
//         int n = sc.nextInt();
//         int original=n, reversed=0;
//         int remainder;
//         while(n!=0){
//             remainder=n%10;
//             reversed=reversed*10+remainder;
//             n/=10;
//         }
//         if(original==reversed){
//             System.out.println("It is a palindrome number");
//         }
//         else{
//             System.out.println("It is not a palindrome number");
//         }
//     }
// }

import java.lang.*;
class Details{
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("Int Byte:"+Integer.BYTES);
    }
}