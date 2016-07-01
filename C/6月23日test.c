#include<stdio.h>

void ptr_func(int *wa, int *seki)
{
	int vx, vy;
	
	puts("二つの変数に数値を格納して下さい。");

	printf("整数A：");	scanf("%d", &vx);
	printf("整数B：");	scanf("%d", &vy);

	*wa = vx + vy;
	*seki = vx * vy;

}

int main(void)
{
	int sum, mulp;

	ptr_func(&sum ,&mulp);

	printf("二つの変数の和は%dです。\n", sum);

	printf("二つの変数の積は%dです。\n", mulp);

	return(0);
}