import java.util.Scanner;

class Calc
{
   public static void main(String args[])
   {
	int x1 = (int)(Math.random()*100)+1;
	int x2 = (int)(Math.random()*100)+1;
	int x3;
	int k;
	k = 1;

	x3 = x1 + x2;

	System.out.println("����x1�F" + x1);
	System.out.println("����x2�F" + x2);

while(true){
	


	System.out.println("�ȉ����v�Z���A���ʂ���͂��Ă��������F");
	System.out.println("�����ɂȂ�܂ŁA���񓚂��Ă��悢�ł��I");

	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();

	if(num == x3){
	System.out.println("�����ł��I");

	System.out.println("��������܂ł�" + k + "��|����܂���");
	if(k >= 10){
	System.out.println("�܂��܂��ł��ˁc");
	}else if(k >= 5){
	System.out.println("���̒��q�ł����Ɗ撣�낤�I");
	}else{
	System.out.println("�N�͓V�˂��I");
	}

	break;
	}else{
	System.out.println("�s�����ł�");
	k++;
	}
	
}


	System.out.println("���Ȃ݂ɒ��g�͂���ł����I");
	System.out.println(x1 +" + " + x2 + " = " + x3);







///////////


///////////





   }
}

