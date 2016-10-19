#include <stdio.h>
#include <stdlib.h>
#include <time.h> //用到了time函数
int Partition(int r[],int first,int last)
{
 int i = first;
 int j = last;
 while(i<   j)
 {
     while(i<j&&r[i]<=r[j])
        j--;
     if(i<j)
     {
         int temp;
         temp = r[i];
         r[i] = r[j];
         r[j] = temp;
         i++;
     }
     while(i<j&&r[i]<=r[j])
        i++;
     if(i<j)
     {
          int temp;
         temp = r[i];
         r[i] = r[j];
         r[j] = temp;
         j--;
     }
 }
 return i;
}
int QuickSort(int r[],int first,int last)
{
     int pivot;
    if(first<last)
    {
    pivot=Partition(r,first,last);
    QuickSort(r,first,pivot-1);
    QuickSort(r,pivot+1,last);
    }
}

int main()
{
    printf("下面由随机数函数产生110个0-200的随机数组:\n");
int n;
int a[110];
srand((unsigned) time(NULL)); //用时间做种，每次产生随机数不一样
printf("排序前的数组：\n");
for (n=0; n<110; n++)
{
a[n] = rand() % 201; //产生0-200的随机数
printf("%d ", a[n]);
}
  QuickSort(a,0,110);
 printf("\n排序后的数组：\n");
  for (n=0; n<110; n++)
{
printf("%d ", a[n]);
}
while(1)
    {
printf("\n请输入K值，接着输出第K大的数字：\n");
int b;
scanf("%d",&b);
printf("第K小的元素为:\n");
printf("%d",a[b-1]);
}
return 0;
}

