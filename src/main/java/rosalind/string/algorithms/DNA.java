package rosalind.string.algorithms;

public class DNA {

 DNA(){

 }

 String countingNucleotides(String sequence){
     int countA = 0;
     int countC = 0;
     int countG = 0;
     int countT = 0;

     for (char c : sequence.toCharArray()) {
         switch (c) {
             case 'A': countA++; break;
             case 'C': countC++; break;
             case 'G': countG++; break;
             case 'T': countT++; break;
             default: break;
         }
     }

     return countA + " " + countC + " " + countG +" " + countT;
 }
}
