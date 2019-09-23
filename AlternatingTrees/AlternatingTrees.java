package AlternatingTrees;

// 45 mins
class Solution {
    public int solution(int[] A) {
        int count = 0;
        if(checkAesthetic(A, -1)) return 0;

        for (int i = 0; i < A.length; i++) {
            if(checkAesthetic(A, i)) count++;
        }

        if(count == 0) return -1;

        return count;
    }

    public boolean checkAesthetic(int[] A, int cutLoc) {
        int prev = 0;
        Integer check = null;
        int i = cutLoc == 0 ? 1 : 0;

        prev = A[i++];
        for (; i < A.length; i++) {
            if (i == cutLoc) continue;
            int val = prev - A[i];
            if (check != null) {
                if( (check > 0 && val > 0) || (check < 0 && val < 0)) return false;
            }
            check = val;
            if(check == 0) return false;
            prev = A[i];
        }
        return true;
    }
}
