import javax.swing.plaf.synth.SynthOptionPaneUI;

public class rajeshpatel{
    public static void main(String[] args) {
      String str = "Rajesh Patel's home number  0751254698 £50.00 Java & Selenium * * *";

      String str1 = str.replaceAll("\\s","");
      System.out.println(str1);
      String str2 = "Rajesh Patel's home number  0751254698 £50.00 Java & Selenium * * *";
      //Approach-1 (replaceAll() method)

        System.out.println("The number part is:"+str2.replaceAll("[^a-zA-Z]",""));
        String str3 = "Rajesh Patel's home number  0751254698 £50.00 Java & Selenium * * *";
        System.out.println("The number part is:"+str3.replaceAll("[^0-9]", ""));
        String str4 = "Rajesh Patel's home number  0751254698 £50.00 Java & Selenium * * *";
        System.out.println("The number part is:"+str4.replaceAll("[java]", ""));
        String str5 = "Rajesh Patel's home number  0751254698 £50.00 Java & Selenium * * *";
        System.out.println("The number part is:"+str5.replaceAll("[a-zA-Z]", ""));
        String input1 = "Rajesh Patel's home number  0751254698 £50.00 Java & Selenium * * *";
        String input2 = "Rajesh Patel's home number  0751254698 £50.00 Java & Selenium * * *";

        System.out.println(input1);
        System.out.println(input1.toLowerCase());
        System.out.println(input2.toUpperCase());
        String str6 = "Rajesh Patel's home number  0751254698 £50.00 Java & Selenium * * *";
        System.out.println(str6.length());
        String str7 = "Rajesh Patel's home number  0751254698 £50.00 Java & Selenium * * *";
        System.out.println("Index of P="+str7.indexOf("P"));
        String str8 = "Rajesh Patel's home number  0751254698 £50.00 Java & Selenium * * *";



    }

}




