#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
int main()
{
    char s[1000];           // take string from the user
    scanf("%s",s);
    int i;
    int arr[10]={0};        // Initialized all its elements with zero

    for(i=0;i<strlen(s);i++)
    {
        if(s[i]<=57 && s[i]>=48)
        {
            arr[s[i]-48]++; // incrementing the found number
        }
    }

    for(i=0;i<10;i++)
        printf("%d",arr[i]);
        return 0;
}