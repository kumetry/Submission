// 配列を利用した例

// コンパイル: javac Sample1.java
// 実行: java Sample1
class Sample1
{
   public static void main(String args[])
   {
      int test[];	// 配列宣言
      test = new int[5];// 領域確保
      
      // 配列にデータを代入
      test[0] = 80;
      test[1] = 60;
      test[2] = 22;
      test[3] = 50;
      test[4] = 75;

int x;
x = 100;
System.out.println( x );

test[0] = 90;

System.out.println( test[0] );

test[4] = x;

System.out.println( test[4] );

int s[];

s = new int[4];

s[0] = 50;

s[1] = 40;

s[2] = 30;

s[3] = 20;

int sum = s[0] + s[1] + s[2] + s[3];

System.out.println("合計：" + sum );

System.out.println("番号：" + s[0] );

System.out.println("番号：" + s[1] );

System.out.println("番号：" + s[2] );

System.out.println("番号：" + s[3] );

int a;
for(a = 0; a < 4; a += 1){
System.out.println( a );
}

for(a = 0; a < 4; a += 1){
System.out.println((a+1) + "番目：" + s[a] );
}


int k[];

k = new int[6];

k[0] = 65;
k[1] = 84;
k[2] = 74;
k[3] = 90;
k[4] = 87;
k[5] = 93;

int m[];

m = new int[6];

m[0] = 71;
m[1] = 83;
m[2] = 74;
m[3] = 90;
m[4] = 78;
m[5] = 95;

int g;

int h;

h = g = 0;

for(int b = 0; b < 6; b += 1){
System.out.println("出席番号：" + (b + 1) + "国語：" + k[b] + "数学" + m[b] );
g += k[b];
}
h = g / 6;

System.out.println("国語の合計：" + g );

System.out.println("国語の平均：" + h );

      // 配列の中身を出力する
      for(int i=0; i<5; i++){
         System.out.println((i+1) + "番目の人の点数は" + test[i] + "です。");
     }
   }
}
