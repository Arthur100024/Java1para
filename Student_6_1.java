import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner cout = new Scanner(System.in);

        int x;
        System.out.print("Напишите количество элементов в массиве: ");
        int n=cout.nextInt();

        //Заполнение исходного массива
        int iDNumber[]=new int[n];
        System.out.printf("\nНапишите %d элементов массива: ",n);
        for(int i=0; i<iDNumber.length; i++)
            iDNumber[i]= cout.nextInt();

        //Сортиврока исходного массива
        for(int i=1; i<iDNumber.length; i++)
            for(int j=0; j<(iDNumber.length-i); j++)
                if(iDNumber[j]>iDNumber[j+1]) {
                    x = iDNumber[j+1];
                    iDNumber[j+1]=iDNumber[j];
                    iDNumber[j] = x;
                }

        System.out.print("Ваш отсортированный массив: ");
        for(int i=0; i<iDNumber.length; i++)
            System.out.print(iDNumber[i]+" ");

        //Вставка в массиве
        System.out.println("Хотите ли вы вставить элемент в массив?");

        String answer = cout.next();
        answer=answer.toLowerCase();

        if(answer.equals("да")){
            int OTHERiDNumber[]=new int[n+1];
            System.out.print("\nНапишите число: ");
            int number = cout.nextInt();
            System.out.printf("\nТеперь его индекс. Он не должен превышать %d и быть меньше 0: ", n);
            int index = cout.nextInt();
            for(int i=0; i<iDNumber.length; i++)
                OTHERiDNumber[i]=iDNumber[i];

            for(int i=OTHERiDNumber.length-1; i>index; i--)
                OTHERiDNumber[i]=OTHERiDNumber[i-1];
            OTHERiDNumber[index]=number;

            System.out.print("Ваш новый массив: ");
            for(int i=0; i<OTHERiDNumber.length; i++)
                System.out.print(OTHERiDNumber[i]+" ");

            for(int i=1; i<OTHERiDNumber.length; i++)
                for(int j=0; j<(OTHERiDNumber.length-i); j++)
                    if(OTHERiDNumber[j]>OTHERiDNumber[j+1]) {
                        x = OTHERiDNumber[j+1];
                        OTHERiDNumber[j+1]=OTHERiDNumber[j];
                        OTHERiDNumber[j] = x;
                    }
            System.out.print("\n");
            System.out.print("Ваш отсортированный новый массив: ");
            for(int i=0; i<OTHERiDNumber.length; i++)
                System.out.print(OTHERiDNumber[i]+" ");
        }
    }
}
