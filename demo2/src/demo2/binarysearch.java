package demo2;

import java.util.Scanner;

public class binarysearch {

    public static void main(String[]args) {

        int a[] = {10,20,30,40,50,60};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key");
        int key = sc.nextInt();

        int low=0;
        int high=a.length - 1;
        boolean found=false;
        int idx =0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid]==key) {
                found=true;
                idx=mid;
                break;
            } 
            else if (key<a[mid]) {
                high=mid-1;
            } 
            else {
                low=mid+1;
            }
        }

        if (found) {
            System.out.println("Key is found at index " + idx);
        } else {
            System.out.println("Key is not found");
        }
    }
}
