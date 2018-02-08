#include <stdio.h>
#include <mem.h>

void demo_str(){
    char *str = "Bright";
    printf("|%s|\n", str);
    printf("|%10s|\n", str);
    printf("|%-10s|\n",str);
    printf("|%.3s|\n",str);
    printf("|%.*s|\n", 4, str);

}
void demo_addr(){
    int i = 7;
    printf("i = %d (%p)\n", i, &i);
    char *str = "sunday";
    printf("str = %s (%p)\n", str, str);
    for (int j = 0; j < strlen(str); j++){
        printf("str[%d] = %c (%p)\n", j, str[j], &str[j]);
    }
}
int main()
{
//    demo_str();
    demo_addr();
    return 0;
}

