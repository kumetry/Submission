// �z��̏������̗�

// �R���p�C��: javac Sample4.java
// ���s: java Sample4

class Sample4
{
   public static void main(String args[])
   {
      // �z�������������
      int test[] = {80,60,22,50,75};

System.out.println( test[4] );

System.out.println( test[4] );

int s[] = { 40, 30, 20, 10 };

int k;

for(k = 0; k < 4; k++){

System.out.println( k + "�ԍ��̐l��" + s[k] + "�_�ł��B" );

}

String n[] = { "���Y", "���Y","�O�Y", "�l�N" };

for(k = 0; k < 4; k++){

System.out.println( (k+1) + "�Ԗڂ̖��O��" + n[k] + "�ł��B" );

}

for(k = 0; k <= 3; k += 1){

System.out.println( n[k] + "�̔N���" + s[k]);

}

System.out.println("-------------���݂���--------------");

String luck[] = {"��g", "���g", "���g", "�g", "��" };

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

System.out.println("-------------�ۑ�-----------");

////////////////////////////�ۑ�////////////////////////////////

for(k = 0; k < 20; k++){

koma[k] = (int)(Math.random() * 2) + 0;

System.out.print( koma[k] );

}
System.out.println(" ");


for(k = 0; k < 20; k++){

if(koma[k] == 1){
System.out.print("��");
}
else{
System.out.print("��");
}





////////////////////////////////////////////////////////////////
}
      // �z��̗v�f�̐����@test.length�@�𗘗p���Ċm�F�ł���
      for(int i=0; i<test.length; i++){
         System.out.println((i+1) + "�Ԗڂ̐l�̓_����" + test[i] + "�ł��B");
     }

     System.out.println("�e�X�g�̎󌱎҂�" + test.length + "�l�ł��B");
   }
}
