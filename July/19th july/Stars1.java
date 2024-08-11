
class Stars1{
public static void main(String[] args){
int rows =5;
int k = 1;
for(int i = 1; i<= rows ; i++){
for(int j = 1 ; j<=i ;j++){
System.out.print(char (i-j+1)%2 + " ");
}
System.out.println();
}
}
}
