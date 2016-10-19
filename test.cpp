#include <stdio.h>
#include <stdlib.h>
#include <time.h> //�õ���time����
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
    printf("�������������������110��0-200���������:\n");
int n;
int a[110];
srand((unsigned) time(NULL)); //��ʱ�����֣�ÿ�β����������һ��
printf("����ǰ�����飺\n");
for (n=0; n<110; n++)
{
a[n] = rand() % 201; //����0-200�������
printf("%d ", a[n]);
}
  QuickSort(a,0,110);
 printf("\n���������飺\n");
  for (n=0; n<110; n++)
{
printf("%d ", a[n]);
}
while(1)
    {
printf("\n������Kֵ�����������K������֣�\n");
int b;
scanf("%d",&b);
printf("��KС��Ԫ��Ϊ:\n");
printf("%d",a[b-1]);
}
return 0;
}

