
import java.util.Scanner;

class Kazu {

public static void main(String args[])

{

int num = (int)(Math.random()*100)+1;

System.out.println("作成された数字：" + num);

int y;

y = 0;

while( true ){

System.out.println("この数字は何でしょう？当てて見て下さい：");


Scanner sc = new Scanner(System.in);

int x;
x = sc.nextInt();

y++;

if(x == num){
System.out.println("当たりです。");
break;

}else if(x < num){
System.out.println("ハズレです。");
System.out.println(x + "より大きいです。");

}else{
System.out.println("ハズレです。");
System.out.println(x + "より小さいです。");
}


} //while文

System.out.println(y + "回目で当てました");

}

}