// ��u�C���N�������g���Z�q�̗�

// �R���p�C��: javac Sample3.java
// ���s: java Sample3

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




      int a = 0;	// ��̕ϐ���錾�E�l����i�������j
      int b = 0;

      b = a++;		// ��u�C���N�������g���Z�q�ŕϐ�a�Ab�̒l��ύX������
			// ��u�C���N�������g���Z�q�Ȃ̂ŁAb = a++; �Ȃ̂ŁA�Q�X�e�b�v�̉��Z�ōl����
			// �@ b = a; a�̒l��0��ϐ�b�ɑ���Ab�̒��g��0�ƂȂ�
			// �A a++; �@a�̒l��0��1���v���X���āAa�̒��g���i0+1�j�֕ύX������

      System.out.println("�����ɃC���N�������g�����̂�b�̒l��" + b + "�ł��B");
   }
}
