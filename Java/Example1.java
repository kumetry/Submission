// for�𗘗p�����A�J��Ԃ������̗��

// ���s��Fjava Example1

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



////////////1.�w�肳�ꂽ����"HELLO"��\������////////////////
int s;
for(s = 1; s <= x; s ++){

System.out.println( "HELLO" );

}


/////////////2�D�P�`200�܂ł̎w�肳�ꂽ�����̔{�������\��///////////////
int t;

for(t = 1; t <= 200; t ++){

if(t % x == 0){

System.out.println( t );

}

}

     int count;

     for(count = 1; count < 5; count++){// �J��Ԃ������̒��̕ω��l��count�ł���Acount�̏����l��1�ŁA
					// count�̒l��5��菬�����Ȃ�J��Ԃ����������s����
					// ���[�v����x��count�̒l��1�𑫂�
        System.out.println("count is " + count);
     }

  }
}

