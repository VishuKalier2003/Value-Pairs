/* You are given two non-increasing 0-indexed integer arrays nums1​​​​​​ and nums2​​​​​​...
A pair of indices (i, j), where 0 <= i < nums1.length and 0 <= j < nums2.length, is valid if both i <= j and nums1[i] <= nums2[j]... The distance of the pair is j - i​​​​...
Return the maximum distance of any valid pair (i, j)... If there are no valid pairs, return 0...
An array arr is non-increasing if arr[i-1] >= arr[i] for every 1 <= i < arr.length... 
* Eg 1 : nums1 = [55, 30, 5, 4, 2]          nums2 = [100, 20, 10, 10, 5]          Output = 2
* Eg 2 : nums1 = [2, 2, 2]                  nums2 = [10, 10, 1]                   Output = 1
* Eg 3 : nums1 = [30, 29, 19, 15]           nums2 = [25, 25, 25, 25, 25]          Output = 2
*/
import java.util.*;
public class ValuePairs
{
    public int MaximumDistance(Vector<Integer> nums1, Vector<Integer> nums2)
    {
        int dist = 0;     // Storing the distance of valid pairs...
        for(int j = 0; j < nums2.size(); j++)    // Outer loops runs for nums2 vector...
        {
            for(int i = 0; i <= j; i++)    // Inner loop runs for nums1 vector...
            {
                if((i < nums1.size()) && (nums1.get(i) <= nums2.get(j)))
                {      // If the i index is not out of bounds and the above condition is satisfied...
                    if(dist < (j - i))
                        dist = j - i;       // Computing the new distance...
                }
            }
        }
        return dist;      // Returning the distance...
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x, a;
        System.out.print("Enter the length of first array : ");
        x = sc.nextInt();
        Vector<Integer> n1 = new Vector<Integer>();
        for(int i = 0; i < x; i++)
        {
            System.out.print("Enter data : ");
            a = sc.nextInt();
            n1.add(i, a);
        }
        System.out.print("Enter the length of second array : ");
        x = sc.nextInt();
        Vector<Integer> n2 = new Vector<Integer>();
        for(int i = 0; i < x; i++)
        {
            System.out.print("Enter data : ");
            a = sc.nextInt();
            n2.add(i, a);
        }
        ValuePairs valuepairs = new ValuePairs();               // Object creation...
        int distance = valuepairs.MaximumDistance(n1, n2);      // Function Calling...
        System.out.println("The Maximum distance between valid pairs is : "+distance);
        sc.close();
    }
}


// Time Complexity - O(n^2) time...
// Space Complexity - O(1) space...