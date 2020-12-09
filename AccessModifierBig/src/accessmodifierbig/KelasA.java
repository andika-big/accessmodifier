package accessmodifierbig;

public class KelasA {
    int memberA = 30;
 
  char memberB = 'A';
    double memberC = 1.5;
    
    int functionA() {
        return memberA;
    }
    int functionB() {
        
        int hasil = functionA() + memberA;
        return hasil;
    }
}
