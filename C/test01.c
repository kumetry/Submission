#include<stdio.h>
typedef struct{

	char name [20];
	int juugyouin;
	int shihonkin;
	long uriage;
}gcompany;

int main(void)
{
	gcompany kou = {"KOU", 556, 50, 54200};
	gcompany otsu;
	otsu = kou;

	printf("社名     : %5s, %5s\n", kou.name,      otsu.name);
	printf("従業者数 : %5s, %5d\n", kou.juugyouin, otsu.juugyouin);
	printf("資本金   : %5s, %5d\n", kou.shihonkin, otsu.shihonkin);
	printf("売上高   : %5s, %5d\n", kou.uriage,    otsu.uriage);


	return(0);
}