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

// import java.lang.*;
// class Details{
//     public static void main(String[] args) {
//         System.out.println(Integer.MIN_VALUE);
//         System.out.println(Integer.MAX_VALUE);
//         System.out.println("Int Byte:"+Integer.BYTES);
//     }
// }
// import java.util.*;
// public class Details {

    

// public static void main(String args[]){
//     Scanner mc= new Scanner(System.in);
//     System.out.println("c")

// }
// }

// import java.net.URL;
// import java.util.*;
// public class Details {
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         int n=3;
//         switch(n){ //floating point value huna hudaina switch ma 
//             case 1: System.out.println("One");
//             break ;
        
//             case 2: System.out.println("two");
//             break ;
    
//              case 3: System.out.println("three");
//              break;
//              default: System.out.println("Invalid");
//         }
//     }
// }

// import java.util.Scanner;

// public class Details{
//     public static void main(String args[]){
//         Scanner scan= new Scanner(System.in);
//         System.out.println("Enter domain name:");
//         String domain=scan.nextLine();
//         String ext=domain.substring(domain.lastIndexOf(".")+1);
//         switch(ext){
//             case "com": System.out.println("Cimerital");
//             break;
//             case "org": System.out.println("Organiational");
//             break;
//             case "gov": System.out.println("Government");
//             break;
//             case "net": System.out.println("network");
//             break;
//             default: System.out.println("Inalid Domain");
//         }
//     }
// }

// //wap to accept n number of student records where student has name, roll no, phone, email, and five subject marks then calculate the resukt with percentage and division.

// import java.util.*;
// public class Details{
//     public static void main(String args[]){

//         Scanner scan= new Scanner(System.in);
//         System.out.print("Ener the number of students:");
//         int student_num=scan.nextInt();
//         System.out.println("Student Details");
//         for(int i=1;i<=student_num;i++){
//             System.out.println("Details of Student:"+i);
//             System.out.println("Enter Student Name:");
//             String name = scan.next();
//             System.out.println("Enter email:");
//             String email = scan.nextL();
//             System.out.println("enter phone number");
//         }
//     }
// }

// import java.util.*;
// public class Details{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number:");
//         String n = sc.nextLine();
//         int original= n, reversed=0;
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

// import java.util.*;

// import javax.swing.BoxLayout;
// public class New {
//     public static void main(String args[]){
//         System.out.print("Enter ths number u wan to convert");
//         Scanner sc=new Scanner(System.in);
//         int number=sc.nextInt();
//         String binaryString=Integer.toBinaryString(number);
//         System.out.println("In binary:"+binaryString);
//         String hex=Integer.toHexString(number);
//         System.out.println("In hexadecimal:"+hex);
//         String oct=Integer.toOctalString(number);
//         System.out.println("In octal:"+oct);

//     }
// }

// import java.util.*;
// public class New{

    

// public static void main(String args[]){
//     Scanner mc= new Scanner(System.in);
//     System.out.println("Enter the first value:");
//     int x= mc.nextInt();
//     System.out.println("Enter the second value:");
//     int y= mc.nextInt();
//     int sum=x+y;
//     if(sum%2==0){
//         System.out.println("Even");
//     }
//     else{
//         System.out.println("Odd");
//     }

// }
// }


// import java.util.*;
// public class New{
// public static void main(String[] args){
//     Scanner sc= new Scanner(System.in);
//     String username = "asd"; // string is class , username (object veriable)string object variable
//     String password = "asd";
//     System.out.print("Enter the username:");
//     String var1= sc.nextLine();
//     System.out.print("Enter the password:");
//     String var2= sc.nextLine();
//     if(username.equals(var1) && password.equals(var2)){
//         System.out.println("Log in");
//     }
//     else{
//         System.out.println("Invalid Username and Password");
//     }


    

    
// }
// }
//wap to find which protocol is used to search the ur

// import java.util.Scanner;

// class Student {
//     String name;
//     int rollNo;
//     String phone;
//     String email;
//     int[] marks = new int[5];
//     double percentage;
//     String division;

//     void calculateResult() {
//         int totalMarks = 0;
//         for (int mark : marks) {
//             totalMarks += mark;
//         }
//         percentage = totalMarks / 5.0;

//         if (percentage >= 60) {
//             division = "First";
//         } else if (percentage >= 50) {
//             division = "Second";
//         } else if (percentage >= 40) {
//             division = "Third";
//         } else {
//             division = "Fail";
//         }
//     }
// }

// public class New{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of students: ");
//         int n = sc.nextInt();
//         Student[] students = new Student[n];

//         for (int i = 0; i < n; i++) {
//             students[i] = new Student();
//             sc.nextLine();
//             System.out.println("Enter details for student " + (i + 1) + ":");
//             System.out.print("Name: ");
//             students[i].name = sc.nextLine();
//             System.out.print("Roll No: ");
//             students[i].rollNo = sc.nextInt();
//             sc.nextLine(); 
//             System.out.print("Phone: ");
//             students[i].phone = sc.nextLine();
//             System.out.print("Email: ");
//             students[i].email = sc.nextLine();
//             System.out.println("Enter marks for 5 subjects:");
//             for (int j = 0; j < 5; j++) {
//                 System.out.print("Subject " + (j + 1) + ": ");
//                 students[i].marks[j] = sc.nextInt();
//             }
//             students[i].calculateResult();
//         }

//         System.out.println("\nStudent Records:");
//         System.out.printf("%-15s %-10s %-15s %-25s %-10s %-12s\n", "Name", "Roll No", "Phone", "Email", "%", "Division");
//         for (Student s : students) {
//             System.out.printf("%-15s %-10d %-15s %-25s %-10.2f %-12s\n", s.name, s.rollNo, s.phone, s.email, s.percentage, s.division);
//         }

//     }
// }

// class ForEachLoop {
//     public static void main(String[] args){
//     int nums[]={1,2,3,4,5,6,7,8,9};


// int sum=0 ;

// for(int x:nums){

//     System.out.println("Value is :"+x);
//     sum=sum+x;


// }
//     System.out.println("Summation:"+sum);

// }
// }
