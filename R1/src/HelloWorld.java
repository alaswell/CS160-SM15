
public class HelloWorld {
	public static void main(String[] args) {
		

String fruit = "Bananas, apples, mangoes";
int a = 0;
while ( a < fruit.length() ){
    if(fruit.charAt(a) == 'a')
         System.out.printf( "%c ", fruit.charAt(a) );
    a = a + 3;

 }
}
}
