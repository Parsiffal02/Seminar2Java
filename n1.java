import java.util.Scanner;
public class n1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);    
            int array_size = 0;        int array[];   
                 do {
            System.out.print("Введите размерность массива: ");          
              while (!in.hasNextInt()) {
                System.out.println("Вы ввели не целое число или текст ");               
                 in.next();           
                 }
            array_size = in.nextInt();           
             if (array_size <= 0) {
                System.out.println("Вы ввели отрицательное число или ноль ");           
             }
        } while (array_size <= 0);        
        array = new int[array_size];        
        for (int i = 0; i < array_size; i++) {
            do {
                System.out.print("Введите элемент: ");                
                while (!in.hasNextInt()) {
                    System.out.println("Вы ввели не целое число или текст ");                    
                    in.next();               
                 }
                array[i] = in.nextInt();                
                if (array[i] < -9999*9999 || array[i] > 9999*9999) {
                    System.out.println("Вы ввели слишком большое число ");                
                }
            }
            while (array[i] < -9999*9999 || array[i] > 9999*9999);        
        }

        for (int i = 0; i < array_size / 2; i++) {
            int tmp = array[i];            
            array[i] = array[array_size - 1 - i];            
            array[array_size - 1 - i] = tmp;        
        }

        for (int elem : array)
            System.out.print(elem + " ");        
            in.close();    
        }
}