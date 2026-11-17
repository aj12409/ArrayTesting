import java.util.Random;

public class Main{
    public static void main(String[] args){}
    int[]datapoints=new int[50];
    Random rnd=new Random();
    {
        for(int i=0;i<datapoints.length;i++){
            datapoints[i]=rnd.nextInt(50)+1;

        }
        for (int i=0; i<datapoints.length; i++){
            System.out.print(datapoints[i]+ "|");
        }
        System.out.println();

        int sum=0;
        for(int i=0; i< datapoints.length;i++){
            sum+=datapoints[i];
        }
        double average=(double) sum/ datapoints.length;

        System.out.println("\nThe sum of the random array dataPoints is: "+ sum);
        System.out.print("The average of the random array dataPoints is: " + average);
    }
}
