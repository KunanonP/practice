//
// Created by ZindyBite on 02/02/2018.
//
#include <stdio.h>
int main(){
    int i = 0, first = 0, second = 1, next, n = 100;
    for (int i = 0; i < n; ++i){
        if ( i<= 1 ){
            next = i;
        }else{
            next = first + second;
            first = second;
            second = next;
        }
        if ( next % 2 == 0){
            printf(" %d ", next);
        }
    }
    return 0;
}
