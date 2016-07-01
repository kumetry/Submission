// whileを利用した、繰り返し処理の例題
//  こんにちは！ を１０回表示させる

// 実行例：java Example1

class Example1 {
  public static void main(String args[])
  {

int a;
a = 0;

while(a < 4){
System.out.println("hello");

a += 1;

}

int b;

b = 1;

while(b <= 4){

System.out.println( b );

b ++;

}

int c;

c = 100;

while(c <= 500){


System.out.println( c );

c += 100;

}

int d;

d = 0;

while (d < 5){


System.out.println( d * 100 + 100 );

d ++;

}

//////////// kadai01 //////////////////////
int x;

x = Integer.parseInt( args[0] );

int s;

s = 0;

while(s < x){

System.out.println( "hello" );

s ++;
}
////////////////////////////////////////

//////////////kadai02////////////////


int z;
z = 7;

while(z <= 200){

System.out.println( z );

z += 7;

}
/////////////////////////////////////

////////////////kadai03///////////////////

int k;

k = Integer.parseInt( args[0] );

int n;

n = 0;

while(n < k){

System.out.print( "*" );

n ++;

}

System.out.println( "" );

//////////////////////////////////////

    int count = 1;

     while (count <= 10){


        System.out.println( count );

        count ++;


     }
  }
}

