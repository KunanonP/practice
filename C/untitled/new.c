#include <stdio.h>
int solution( int number )
{
    int  sum = 0;
    for (int i = 0; i < number; ++i){
        if (i % 3 == 0 || i % 5 == 0){
            sum = sum + i;
        }
        printf(sum);
        return 0;
    }
}

int main(){
    solution(10);
}