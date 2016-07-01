// Example1.java の改造版

// コマンドラインから一つのデータを受け取って、そして、if文の利用し、
// 受け取ったデータに対し、判断を行う、
// 判断の結果によって、異なるメッセージを出力するサンプル

// 実行例：
// java Example3 5
// java Example3 10
// java Example3 45

class Example3 {
  public static void main(String args[])
  {
       int a = Integer.parseInt(args[0]);	// コマンドラインから一つの数値を受け取る

       if (a == 10){
         System.out.println("aは10ですよ。");
       }
       else{
         System.out.println("aは10ではないですよ。");
       }

int age = Integer.parseInt(args[0]);

if(age >= 20)
{
System.out.println("お酒を飲んでもOK");
}
else
{
System.out.println("お酒はまだ早い！");
}


int x;
int y;
x = Integer.parseInt(args[0]);

y = x % 7;

if(y == 0)
{
System.out.println("７の倍数ですよ");
}
else
{
System.out.println("７の倍数ではないです");
}


  }
}

