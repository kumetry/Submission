/// if、else による分岐処理のサンプル

// a の値を -100、0、98 で代入し、コンパイル・実行してください

class Example2 {
  public static void main(String args[])
  {

int x = Integer.parseInt(args[0]);

if(x < 20){
System.out.println("ダメですよ。");
}
else{
System.out.println("大丈夫ですよ。");
}

int t;
t = 13;
if(t < 12){
System.out.println("おはよう");

}
else if(t < 18){
System.out.println("こんにちは");
}
else{
System.out.println("こんばんは");
}

int luck;
luck = (int)(Math.random() * 5) + 1;

if(luck == 5){
System.out.println("大吉");
}
else if(luck == 4){
System.out.println("中吉");
}
else if(luck == 3){
System.out.println("吉");
}
else if(luck == 2){
System.out.println("凶");
}
else{
System.out.println("大凶");
}

int y = Integer.parseInt(args[0]);

if(y >= 10){
if (y <= 100){
System.out.println("ok");
}
else{
System.out.println("ng");
}
}

else{
System.out.println("ng");
}



       int  a = -100;

       if (a < 0){
         System.out.println("a は 0 より小さい");
       }
       else if (a > 0){
         System.out.println("a は 0 より大きい");
       }
       else{
         System.out.println("a は 0 ですよ");
       }

  }


}



