#include<stdio.h>

void ptr_func(int *wa, int *seki)
{
	int vx, vy;
	
	puts("��̕ϐ��ɐ��l���i�[���ĉ������B");

	printf("����A�F");	scanf("%d", &vx);
	printf("����B�F");	scanf("%d", &vy);

	*wa = vx + vy;
	*seki = vx * vy;

}

int main(void)
{
	int sum, mulp;

	ptr_func(&sum ,&mulp);

	printf("��̕ϐ��̘a��%d�ł��B\n", sum);

	printf("��̕ϐ��̐ς�%d�ł��B\n", mulp);

	return(0);
}