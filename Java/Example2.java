/// if�Aelse �ɂ�镪�򏈗��̃T���v��

// a �̒l�� -100�A0�A98 �ő�����A�R���p�C���E���s���Ă�������

class Example2 {
  public static void main(String args[])
  {

int x = Integer.parseInt(args[0]);

if(x < 20){
System.out.println("�_���ł���B");
}
else{
System.out.println("���v�ł���B");
}

int t;
t = 13;
if(t < 12){
System.out.println("���͂悤");

}
else if(t < 18){
System.out.println("����ɂ���");
}
else{
System.out.println("����΂��");
}

int luck;
luck = (int)(Math.random() * 5) + 1;

if(luck == 5){
System.out.println("��g");
}
else if(luck == 4){
System.out.println("���g");
}
else if(luck == 3){
System.out.println("�g");
}
else if(luck == 2){
System.out.println("��");
}
else{
System.out.println("�勥");
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
         System.out.println("a �� 0 ��菬����");
       }
       else if (a > 0){
         System.out.println("a �� 0 ���傫��");
       }
       else{
         System.out.println("a �� 0 �ł���");
       }

  }


}



