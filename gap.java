package com.studyopedia;
public class gap {
    public static void main(String[] args){
        int[] a=new int[]{5,8,7,9,3,4};
        for(int i=1;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]>a[i]) {
                    int temp=a[i];
                    a[i] = a[j];
                    a[j]=temp;
                }
            }
        a[i-1]=a[i];
        }
       a[a.length-1]=-1;
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
    }
}}
