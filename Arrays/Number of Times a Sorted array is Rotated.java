// Java program to find number of
// rotations in a sorted and rotated
// array.
import java.io.*;
import java.lang.*;
import java.util.*;

class LinearSearch {
    // Returns count of rotations for an
    // array which is first sorted in
    // ascending order, then rotated
    static int countRotations(int arr[], int n)
    {
        // We basically find index of minimum
        // element
        int min = arr[0], min_index = 0;
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
                min_index = i;
            }
        }
        return min_index;
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        int arr[] = { 15, 18, 2, 3, 6, 12 };
        int n = arr.length;

        System.out.println(countRotations(arr, n));
    }
}
===========================================================
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Assignment {     O(nlogn) space o(1)
    public static int timesArrayRoated(int[] arr)
    {
        int n=arr.length;
        int l=0;
        int r=arr.length-1;
        if(arr[l]<=arr[r])
        {
            return 0;
        }
        while(l<=r)
        {

            int mid=l+(r-l)/2;

            int next=(mid+1)%n;
            int prev=(mid+n-1)%n;

            if(arr[mid]<=arr[next] && arr[mid]<=arr[prev])
            {

                return mid;

            }
            else if(arr[l]<=arr[mid])
            {
                l=mid+1;
            }else if(arr[mid]<=arr[r])
            {
                r=mid-1;
            }


        }
        return -1;
    }

    public static void main(String args[]) {
        int[] arr={7, 9, 11, 12, 5};

        if(timesArrayRoated(arr)>-1)
            System.out.print(timesArrayRoated(arr));
        else
            System.out.println("Not found");
    }
    }


