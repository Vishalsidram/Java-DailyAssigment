class Starm{
public static void main(String[] args){
int rows=5;
int k = 65;
for(int i = 1; i<=rows ; i++){
for (int j = 1 ; j<=i ; j++){
System.out.print((i+j+1)((char)k)%2 + " ");
k++;
}
System.out.println();
}
}
}