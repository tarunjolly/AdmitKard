import java.util.*;

public class reversenum{

public static void calculate(int number,int x,int y){
    //I have the addition operation to find the multiples instead of % operation as % is a costly operation as compared to addtion
    
    
    int countx=0;
    int county=0;
    
    int countxy=0;
    
    int a=0;
    int b=0;
    int c=0;
    int ans=0;
    
    while(a<number || b<number ){
        
        if(countxy==x*y){
         ans+=c;
         countxy=0;     
         countx=0;
         county=0;
        }
        else if(countx==x){
            ans+=a;
            countx=0;
        }
        else if(county==y){
         ans+=b;
         county=0;
        }
        countx++;
        county++;
        countxy++;
        a++;
        b++;
        c++;
        
    }
    System.out.println("Sum of all multiples of "+x+" and "+y +" is "+ans);
    int temp=ans;
    String output="";
    while(temp>0){
        int aaa=temp%10;
        temp=temp/10;
        output+=aaa;
    }
    System.out.println("ReverseNumber: " +output);
    
    
}



public static void main(String[] args) {

    Scanner scn=new Scanner(System.in);
    int number=scn.nextInt();
    int x=scn.nextInt();
    int y=scn.nextInt();
    calculate(number,x,y);
 }
}