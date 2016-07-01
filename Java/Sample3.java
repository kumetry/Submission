// 後置インクリメント演算子の例

// コンパイル: javac Sample3.java
// 実行: java Sample3

class Sample3
{
   public static void main(String args[])
   {

int c;
c = 20;
c = c + 5;
c += 10;
System.out.println( c );

int d;
d = 7;

c += d;

System.out.println( c );



int e;

e = c % 7;

System.out.println( e );

c /= 7;

System.out.println( c ); 

c = 10;

c = c + 1;

c += 1;

c ++;

++ c;

System.out.println( c );

c = 10;

c = c - 1;
c -= 1;
c --;
--c;

System.out.println( c );

int x = 100;
int y = 200;
int z = 300;
int m = 7;

x += 1;

y = y / m;

z = z % m;

System.out.println( x );
System.out.println( y );
System.out.println( z );




      int a = 0;	// 二つの変数を宣言・値代入（初期化）
      int b = 0;

      b = a++;		// 後置インクリメント演算子で変数a、bの値を変更させる
			// 後置インクリメント演算子なので、b = a++; なので、２ステップの演算で考える
			// ① b = a; aの値の0を変数bに代入、bの中身は0となる
			// ② a++; 　aの値の0に1をプラスして、aの中身を（0+1）へ変更させる

      System.out.println("代入後にインクリメントしたのでbの値は" + b + "です。");
   }
}
