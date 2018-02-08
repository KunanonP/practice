//
// Created by ZindyBite on 04/02/2018.
//
#include <stdio.h>
#include <conio.h>
#include <math.h>

void circle(double r){
    double area, pi;
//    double r;
    pi = 3.14;
    r = pow(r, 2);
    area = pi * r;
    printf("circle area: %.2f\n", area);
}

double rectangle(double w, double h){
    double area;
    area = w * h;
    return area;
}

int main(){
    double w, h;
    printf("please put width: ");
    scanf("%lf", &w);
    printf("pleaase put height");
    scanf("%lf", &h);
    printf("rectangle area: %.2f\n", rectangle(w, h));
    circle(w);
    getch();
}
