import java.util.*;
class Task1{

public static void main(String[] args){
int k =1;
int rows =6;
Scanner s = new Scanner(System.in);
System.out.println("Enter the number of rows"); 
for(int i=1; i<=rows ; i++){
for(int j=1; j<=rows ; j++){
System.out.print(k +" "); 
k++;
}
System.out.println();
}
}
}

