package TreeVisibility;

// 20 mins
class Solution{
    public int solution(Tree t){
        int result = 0;

        result += traverseTree(t, Integer.MIN_VALUE);
        return result;
    }

    public int traverseTree(Tree t, int prevMin){
        if(t == null) return 0;
        int count = 0;
        if(t.x >= prevMin)
            count++;
        count += traverseTree(t.l, Math.max(t.x, prevMin));
        count += traverseTree(t.r, Math.max(t.x, prevMin));
        return count;
    }
}

class Tree{
    public int x;
    public Tree l;
    public Tree r;
}