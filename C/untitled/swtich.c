#include <stdio.h>

void demo_switch(){
    char menu;
    int  q, price, p;
    printf("1. [M]ocha - $10\n");
    printf("2. [L]atte - $22\n");
    printf("3. [C]apuchino - $35\n");
    printf("4. [E]xpresso - $48\n");
    printf("5. [O]ther\n");
    printf("please choose menu number or [k]ey: ");
    scanf("%c", &menu);
    switch (menu){
        case '1':
        case 'm':
            p = 10;
            printf("Please put how many cup you want to order for Mocha: ");
            scanf("%d", &q);
            price = q * p;
            printf("|your receipt: \n Mocha $10| Quantity: %dea | Total: $%d|", q, price);
            break;
        case '2':
        case 'l':
            p = 22;
            printf("Please put quantity: ");
            scanf("%d", &q);
            price = q * p;
            printf("Latte Total: %dea and $%d", q, price);
            break;
        case '3':
        case 'c':
            p = 35;
            printf("Please put quantity: ");
            scanf("%d", &q);
            price = q * p;
            printf("Latte Total: %dea and $%d", q, price);
            break;
        case '4':
        case 'e':
            p = 48;
            printf("Please put quantity: ");
            scanf("%d", &q);
            price = q * p;
            printf("expresso Total: %dea and $%d", q, price);
            break;
        case '5':
        case 'o':
            printf("nothing");
            break;
        default:
            printf("you choose invalid menu");
            break;
    }
}

int main(){
    demo_switch();
}