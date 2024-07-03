// import java.util.*;

class BallChild {
    public int numberOfChild(int n, int k) {
     n--;
     int round =  k/n;
     int  rem = k%n;
     if(round%2==0){
        return rem; //1
     }
     else{
        return n-rem; 
     }
    
    }

    public static void main(String[] args) {
        BallChild s = new BallChild();
        System.out.println(s.numberOfChild(3, 5)); //output - 1
        // System.out.println("Hello World!");
        
    }
}