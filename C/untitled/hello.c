//
// Created by ZindyBite on 31/01/2018.
//
#include <stdio.h>
#include <math.h>

int test(int numb){
    return numb * 2;
}
void moo(int numbe){
    if (numbe == 2){
        printf("moo");
    }else{
        printf("not moo = %d", numbe);
    }
}

void boo(int abc){
    while ( abc < 10){
        abc++;
        printf(" %d ", abc);
    }
}

int main(){
    int a[5] = {1,2,3,4,5};
    int b[5] = {3,2,9,3,7};
    int n = 0;
    printf("a = %d\n",a[0]);
    printf("a = %d\n",a[1]);
    printf("a = %d\n",a[2]);
    printf("a = %d\n",a[3]);
    printf("a = %d\n",a[4]);
    printf("b = %d\n",b[0]);
    printf("b = %d\n",b[1]);
    printf("b = %d\n",b[2]);
    printf("b = %d\n",b[3]);
    printf("b = %d\n",b[4]);

    for (int i = 0; i < 5; i++) {
        printf("number a: %d\nnumber b: %d\narray: [%d]\n", a[i], b[i], i);
    }
    for (int i = 0; i < 5; i++){
        printf(" %d" , a[i]);
    }

    for (int i = 5; i > 0; i--){
        printf(" %d", b[i-1]);
    }

    for (int i = 0; i <= 100; i++){
        if (i % (3*5) == 0)
                printf("FizzBuzz \n");
            else if (i % 3 == 0)
                printf("Fizz \n");
            else if (i % 5 == 0)
                printf("Buzz \n");
            else
                printf(" %d\n" , i);
        }


    while (n < 100) {
        n++;
        printf(" %d ", n);
        if (n % 2 == 1){
            printf("number %d is odd \n", n);
        } else {
            printf("number %d is even \n", n);
        }
        if (n == 10) {
            break;
        }
    }

    printf("test function: %d\n", test(1));
    moo(test(2));
//    printf("\n boo: %d ", boo);
    boo(2);
    printf("\n = %.2f", pow(3,2));
    printf("\n put your number: ");
    scanf("%d", &n);
    printf("\n");
    printf("your number is: %d", n);
    return 0;

}
