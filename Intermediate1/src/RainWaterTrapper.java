import java.util.ArrayList;
import java.util.List;

public class RainWaterTrapper {
    public static void main(String[] args) {
        List<Integer> A=new ArrayList<>();
        A.add(0);
        A.add(1);
        A.add(0);
        A.add(2);


        int length=A.size();
        List<Integer> Lmax=new ArrayList<>();
        Lmax.add(0,A.get(0));
        List<Integer> Rmax=new ArrayList<>();
        Rmax.add(length-1,A.get(length-1));

        int amountOfWater=0;
        int totalWaterTrapped=0;


        for(int i=1;i<length;i++)
        {
            if(A.get(i)>Lmax.get(i-1))
                Lmax.add(i,A.get(i));
            else
                Lmax.add(i,Lmax.get(i-1));
            System.out.println(Lmax.get(i));
        }
        for(int i=length-2;i>=0;i--)
        {
            if(A.get(i)>Rmax.get(i+1))
                Rmax.add(i,A.get(i));
            else
                Rmax.add(i,Rmax.get(i+1));
            System.out.println(Rmax.get(i));
        }

        for(int i=0;i<length;i++)
        {
            amountOfWater=Math.min(Lmax.get(i),Rmax.get(i))-A.get(i);
            totalWaterTrapped+=amountOfWater;
        }
        System.out.println(totalWaterTrapped);


    }
        // DO NOT MODIFY THE LIST. IT IS READ ONLY

}
