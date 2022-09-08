/*
通过从输入中逐字符进行读取而不是逐行进行读取，可以避免
长度限制
*/
#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    int ch;
    int line;
    int at_beginning;

    line = 0;
    at_beginning = 1;

    // 读取字符 逐个处理
    while ((ch = getchar()) != EOF) {
        // 如果处于一行的起始位置，打印行号
        if (at_beginning == 1) {
            at_beginning = 0;
            line += 1;
            printf("%d ", line);
        }
        // 打印字符 对行尾进行检查
        putchar(ch);
        if (ch == '\n')
            at_beginning = 1;
    }

    return EXIT_SUCCESS;
}