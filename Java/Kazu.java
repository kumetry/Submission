
import java.util.Scanner;

class Kazu {

public static void main(String args[])

{

int num = (int)(Math.random()*100)+1;

System.out.println("�쐬���ꂽ�����F" + num);

int y;

y = 0;

while( true ){

System.out.println("���̐����͉��ł��傤�H���ĂČ��ĉ������F");


Scanner sc = new Scanner(System.in);

int x;
x = sc.nextInt();

y++;

if(x == num){
System.out.println("������ł��B");
break;

}else if(x < num){
System.out.println("�n�Y���ł��B");
System.out.println(x + "���傫���ł��B");

}else{
System.out.println("�n�Y���ł��B");
System.out.println(x + "��菬�����ł��B");
}


} //while��

System.out.println(y + "��ڂœ��Ă܂���");

}

}