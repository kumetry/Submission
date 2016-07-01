// forを利用した、繰り返し処理の例題

// 実行例：java Example1

class Example1 {
  public static void main(String args[])
  {


int a;

for(a = 0; a < 3; a = a + 1){

System.out.println("hello");

}

int b;

for(b = 1; b < 5; b = b + 1){

System.out.println( b );

}

int c;

for(c = 1; c <= 20; c ++ ){

System.out.println( c );

}

int d;

for(d = 1; d <= 20; d ++){

if(d % 3 == 0){

System.out.print( d + ", " );

}
else if(d % 5 == 0){

System.out.print( d + ", ");

}

}

System.out.println();

int e;
for(e = 1; e <= 5; e ++){

System.out.println( e * 100 );

}

e = 1;
System.out.println( e <= 5 );


int x;
x = Integer.parseInt( args[0]);



////////////1.指定された数の"HELLO"を表示する////////////////
int s;
for(s = 1; s <= x; s ++){

System.out.println( "HELLO" );

}


/////////////2．１～200までの指定された数字の倍数だけ表示///////////////
int t;

for(t = 1; t <= 200; t ++){

if(t % x == 0){

System.out.println( t );

}

}

     int count;

     for(count = 1; count < 5; count++){// 繰り返し処理の中の変化値がcountである、countの初期値は1で、
					// countの値が5より小さいなら繰り返し処理を実行する
					// ループする度にcountの値が1を足す
        System.out.println("count is " + count);
     }

  }
}

