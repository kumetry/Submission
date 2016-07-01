// 配列の初期化の例

// コンパイル: javac Sample4.java
// 実行: java Sample4

class Sample4
{
   public static void main(String args[])
   {
      // 配列を初期化する
      int test[] = {80,60,22,50,75};

System.out.println( test[4] );

System.out.println( test[4] );

int s[] = { 40, 30, 20, 10 };

int k;

for(k = 0; k < 4; k++){

System.out.println( k + "番号の人は" + s[k] + "点です。" );

}

String n[] = { "太郎", "次郎","三郎", "四朗" };

for(k = 0; k < 4; k++){

System.out.println( (k+1) + "番目の名前は" + n[k] + "です。" );

}

for(k = 0; k <= 3; k += 1){

System.out.println( n[k] + "の年齢は" + s[k]);

}

System.out.println("-------------おみくじ--------------");

String luck[] = {"大吉", "中吉", "小吉", "吉", "凶" };

int z;

z = (int)(Math.random() * 5) + 0;

System.out.println( luck[z] );


int koma[];
koma = new int[20];



for(k = 0; k < 20; k++){

koma[k] = (int)(Math.random() * 2) + 0;

System.out.print( koma[k] );

}
System.out.println(" ");

System.out.println("-------------課題-----------");

////////////////////////////課題////////////////////////////////

for(k = 0; k < 20; k++){

koma[k] = (int)(Math.random() * 2) + 0;

System.out.print( koma[k] );

}
System.out.println(" ");


for(k = 0; k < 20; k++){

if(koma[k] == 1){
System.out.print("○");
}
else{
System.out.print("●");
}





////////////////////////////////////////////////////////////////
}
      // 配列の要素の数が　test.length　を利用して確認できる
      for(int i=0; i<test.length; i++){
         System.out.println((i+1) + "番目の人の点数は" + test[i] + "です。");
     }

     System.out.println("テストの受験者は" + test.length + "人です。");
   }
}
