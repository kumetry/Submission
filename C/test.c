#include <stdio.h>

#define diff(x,y) ((x > y) ? (x - y) : (y - x))

int main(void)
{
	double na, nb, nc, i;

	na =10000;

	nb = 260 * 2;

	nc = na / nb;

	if (( nc - (double)i ) > 0 ) {
		nc = nc + 1;
	}

	
	printf("%lf日以上使えば元が取れます。\n", nc);

	return (0);
}