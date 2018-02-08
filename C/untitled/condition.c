#include <stdio.h>

void converter(){
    double celcius, farenheit;
    printf("please put degree in celcius: ");
    scanf("%lf", &celcius);
    farenheit = (1.8 * celcius) + 32;
    printf("degree in celcius: %.2f degree in farenheit: %.2f", celcius, farenheit);
}

void age_check(){
    int age;
    printf("How old are you ?: ");
    scanf("%d", &age);
    if( age <= 10 && age > 0){
        printf("you are %d years old, free of charge for kids\n", age);
    } else if ( age > 10 && age <= 18){
        printf("you are %d years old, half price for you !\n", age);
    } else if (age < 0 ) {
        printf("you put incorrect number for age! please try again\n");
        age_check();
    } else {
        printf("you are adult ! pay full of charge plus tips !\n");
    }
    printf ("enjoy your meal!\n");
}

void repeat(){
    int sum;
    sum = 0;
    for (int i = 0; i < 10; i++){
        sum = sum + i;
        printf("sum: %d and i: %d\n", sum, i);
    }
}

int main(){
    repeat();
}

