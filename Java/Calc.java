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

	System.out.println("数字x1：" + x1);
	System.out.println("数字x2：" + x2);

while(true){
	


	System.out.println("以下を計算し、結果を入力してください：");
	System.out.println("正解になるまで、何回答えてもよいです！");

	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();

	if(num == x3){
	System.out.println("正解です！");

	System.out.println("正解するまでに" + k + "回掛かりました");
	if(k >= 10){
	System.out.println("まだまだですね…");
	}else if(k >= 5){
	System.out.println("この調子でもっと頑張ろう！");
	}else{
	System.out.println("君は天才だ！");
	}

	break;
	}else{
	System.out.println("不正解です");
	k++;
	}
	
}


	System.out.println("ちなみに中身はこれでした！");
	System.out.println(x1 +" + " + x2 + " = " + x3);







///////////


///////////





   }
}

