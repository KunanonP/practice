//
// Created by ZindyBite on 01/02/2018.
//
#include <stdio.h>
int main(){
    int a[10], i = 0, j = 0, n, t;

    printf("please put your maximum array: ");
    scanf("%d", &n);
    printf("\n");

    for (int i = 0; i < n; i++){
        printf("please put %dth: ", (i+1));
        scanf("%d", &a[i]);
    }

    for (int j = 0; j<(n-1); j++){
        for (int i = 0; i<(n-1); i++){
            if (a[i+1] < a[i]){
                t = a[i];
                a[i] = a[i+1];
                a[i+1] = t;
            }
        }
    }
    printf("ASC: ");
    for (int i = 0; i < n; i++){
        printf(" %d ", a[i]);
    }
    printf("\n");

    printf("DESC: ");
    for (int i = n; i > 0; i--){
        printf(" %d ", a[i]);
    }
    printf("\n");
}
