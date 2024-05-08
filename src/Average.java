 import org.w3c.dom.ls.LSOutput;

 import java.util.Scanner;
 public class Average {
     public static void main (String[]args) {


         Scanner input= new Scanner(System.in);
        String[] lessons = {"Matematik","Fizik","Kimya","Turkce","Tarih","Muzik"};

        int sum = 0;
        int gpa = 0;
        for(String lesson : lessons){
           System.out.println(lesson + " notuzunu giriniz");
           sum += input.nextInt();
        }

        gpa = sum / lessons.length;
         System.out.println("Not ortalamaniz \n" + gpa);

         String result = (gpa >= 60 ? "Sınıfı Gectiniz" : " Sınıfta Kaldınız");
         System.out.println(result);
     }
 }

