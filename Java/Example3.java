// Example1.java �̉�����

// �R�}���h���C�������̃f�[�^���󂯎���āA�����āAif���̗��p���A
// �󂯎�����f�[�^�ɑ΂��A���f���s���A
// ���f�̌��ʂɂ���āA�قȂ郁�b�Z�[�W���o�͂���T���v��

// ���s��F
// java Example3 5
// java Example3 10
// java Example3 45

class Example3 {
  public static void main(String args[])
  {
       int a = Integer.parseInt(args[0]);	// �R�}���h���C�������̐��l���󂯎��

       if (a == 10){
         System.out.println("a��10�ł���B");
       }
       else{
         System.out.println("a��10�ł͂Ȃ��ł���B");
       }

int age = Integer.parseInt(args[0]);

if(age >= 20)
{
System.out.println("����������ł�OK");
}
else
{
System.out.println("�����͂܂������I");
}


int x;
int y;
x = Integer.parseInt(args[0]);

y = x % 7;

if(y == 0)
{
System.out.println("�V�̔{���ł���");
}
else
{
System.out.println("�V�̔{���ł͂Ȃ��ł�");
}


  }
}

