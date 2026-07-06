class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        
        if ((nums1.length + nums2.length) % 2 == 1){
            double ite = Math.ceil(((double)nums1.length + (double)nums2.length) / 2);
            int i = 0;
            int j = 0;
            while (i < nums1.length && j < nums2.length && (i + j) < ite){
                if (i + j + 1 == ite){
                    if (nums1[i] >= nums2[j]){
                        return (double)nums2[j];
                    }
                    else{
                        return (double)nums1[i];
                    }
                }
                else if (nums1[i] >= nums2[j]){
                    j++;
                }
                else if (nums1[i] < nums2[j]){
                    i++;
                }
            }
            if (i == nums1.length && (i + j) < ite){
                while (i + j < ite){
                    if (i + j + 1 == ite){
                        return (double)nums2[j];
                    }
                    else{
                        j++;
                    }
                }
            }
            else if (j == nums2.length && (i + j) < ite){
                while (i + j < ite){
                    if (i + j + 1 == ite){
                        return (double)nums1[i];
                    }
                    else{
                        i++;
                    }
                }
            }
        }
        else{
            int ite = (nums1.length + nums2.length) / 2;
            int curr = 0;
            int i = 0;
            int j = 0;
            while (i < nums1.length && j < nums2.length && (i + j) <= ite){
                if (i + j == ite){
                    if (nums1[i] >= nums2[j]){
                        return ((double) nums2[j] + (double) curr) / 2.0;
                    }
                    else{
                        return ((double) nums1[i] + (double) curr) / 2.0;
                    }
                    
                }
                else if (nums1[i] >= nums2[j]){
                    curr = nums2[j];
                    j++;
                }
                else if (nums1[i] < nums2[j]){
                    curr = nums1[i];
                    i++;
                }
            }

            if (i == nums1.length && (i + j) <= ite){
                while (i + j <= ite){
                    if (i + j == ite){
                        return ((double)nums2[j] + (double)curr) / 2.0;
                    }
                    else{
                        curr = nums2[j];
                        j++;
                    }
                }
            }
            else if (j == nums2.length && (i + j) <= ite){
                while (i + j <= ite){
                    if (i + j == ite){
                        return ((double)nums1[i] + (double)curr) / 2.0;
                    }
                    else{
                        curr = nums1[i];
                        i++;
                    }
                }
            } 
        }
        return -1.0;
    }
}
