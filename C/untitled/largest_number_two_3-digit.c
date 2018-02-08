//
// Created by ZindyBite on 02/02/2018.
//
#include <stdio.h>
int palindrome(unsigned long orig);
int main(){
    unsigned int n, m, cap = 0;

    for (n = 100; n <= 999; n++){
        for (m = 100; m <= 999; m++){
            unsigned int a = n*m;
            if(palindrome(a) && a > cap){
                cap = a;
            }
        }
    }
    printf("Largest number from two 3-digit: %d ", cap);
    return 0;

}

int palindrome(unsigned long orig){
    unsigned long calculated = 0, n = orig;
    while (n > 0){
        calculated = calculated * 10 + n % 10;
        n /= 10;
    }
    return orig == calculated;
}
