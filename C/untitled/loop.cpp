#include <stdio.h>
void demo_loop(){
    for (double i = 10; i>=0; i-=.5){
        printf("%.2f\n", i);
    }
}

void converter_loop(){
    for (int i = 0; i<=10; i++){
        printf("%d ounce = %.4f grams\n", i, i * 28.3495);
    }
    for (double j = 100; j<=10000; j+=100){
        printf("%5.2f grams = %5.2f kilograms\n", j, j / 1000);
    }
}

void multiple_loop(){
    int n;
    printf("please put number: ");
    scanf("%d", &n);
    for (int i = 1; i <=12; i++){
        printf("%d x %d = %d\n", n, i, n * i);
    }
}
int main(){
    multiple_loop();
}