package com.source.leetcode;

import java.util.*;


public class Solution {
	
    static List<Integer> mylist=new ArrayList<Integer>();
    
    public static int maxFun(int a,int b)
    {
    	return a>b?a:b;
    }
	
	public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths=new ArrayList<String>();
        TreeNode p=root;
        Stack<TreeNode> stack=new Stack<TreeNode>();
        //Queue<TreeNode> queue=new ArrayDeque<TreeNode>();
        while(p!=null || !stack.isEmpty())
        {
        	while(p!=null)
        	{
        		stack.addElement(p);
        		paths.add(p.val+"->");
        		p=p.left;        		
        	}
        	if(!stack.isEmpty())
        	{
        		p=stack.pop().right;
        	}
        }
        return paths;
    }
    
    public TreeNode makeBinaryTreeByArray(int[] array,int index){
        if(index<array.length){
            int value=array[index];
            if(value!=0){
                TreeNode t=new TreeNode(value);
                array[index]=0;
                t.left=makeBinaryTreeByArray(array,index*2);
                t.right=makeBinaryTreeByArray(array,index*2+1);
                return t;
            }
        }
        return null;
    }
    
    public int TraverseTree( TreeNode root)
    {
        if(root==null)
           return 0;
        int i=TraverseTree(root.left);
        int j=TraverseTree(root.right);
        return i>=j?i-j:j-i;
        
    } 
    
    public boolean isBalanced(TreeNode root) 
    {
    	    if(root==null)
    	       return true;
    	    int depth=0;
    	    boolean tFlag,rFlag;
    	    depth=Heigth(root.left)-Heigth(root.right);
    	    if(depth>1 || depth<-1)
    	       return false;
    	    tFlag=isBalanced(root.left);
    	    rFlag=isBalanced(root.right);
    	    return tFlag&&rFlag;
    }
    
    public int Heigth(TreeNode root)
    {
    	if(root==null)
    		return 0;
    	int i=Heigth(root.left);
    	int j=Heigth(root.right);
    	if(i>j)
    		return i+1;
    	else
    		return j+1;
    }
    
    public void TraversePreOrder(TreeNode p)
    {
    	if(p==null)
    		return;
    	System.out.println(p.val);
    	TraversePreOrder(p.left);
    	TraversePreOrder(p.right);
    }
    
    public void inOrder(TreeNode root)
    {
        if(root==null)
           return;
        inOrder(root.left);
        mylist.add(root.val);
        inOrder(root.right);
    }
    
    public boolean isSymmetric(TreeNode root)
    {
    	Stack<TreeNode> stack=new Stack<TreeNode>();
    	if(root==null)
    		return true;
    	stack.addElement(root.left);
    	stack.addElement(root.right);
    	while(!stack.isEmpty())
    	{
    		TreeNode rnode=stack.pop();
    		TreeNode lnode=stack.pop();  		
    		//stack.addElement(node.left);
    		//stack.addElement(node.right);
    		if(lnode.left==null && rnode==null) continue;
    		if(lnode==null || rnode==null) return false;
    		if(lnode.left.val!=rnode.right.val || lnode.right.val!=rnode.left.val) return false;
    		stack.addElement(lnode.left);
    		stack.addElement(lnode.right);
    		stack.addElement(rnode.left);
    		stack.addElement(rnode.right);    		
    	}
    	return true;
    	
    	/*int i,j;
    	for(i=0,j=mylist.size()-1;i<j;i++,j--)
    	{
    		if(mylist.get(i)==mylist.get(j))
    			continue;
    		else
    			return false;
    	}
    	return true;
    	if(root==null)
    		return true;
    	Queue<TreeNode> queue=new ArrayDeque<TreeNode>();
    	queue.add(root);
    	while(!queue.isEmpty())
    	{
    		TreeNode front=queue.poll();
    		if(front.left==null && front.right==null)
    			continue;
    		else if(front.left==null || front.right==null)
    			return false;
    		else if(front.left.val==front.right.val)
    		{
    			queue.add(root.left);
        		queue.add(root.right);
    		}
    		else
    			return false;
    	}
    	return true;*/
    }
    /*static public boolean dfs(TreeNode root,int sum)
    {
    	if(root==null && sum==0)
    		return true;
    	if(root==null)
    		return false;
    	if(sum<0)
    		return false;
    	return dfs(root.left,sum-root.val) || dfs(root.right,sum-root.val);
    }*/
    
    public boolean hasPathSum(TreeNode root, int sum) {
         /*if(root==null && sum==0)
            return true;
         if(root==null)
        	 return false;
         if(sum<0)
             return false;
         boolean f1=hasPathSum(root.left,sum-root.val); 
         boolean f2=hasPathSum(root.right,sum-root.val);
         return f1||f2;*/
    	if (root == null)
    		return false;
    	if (root.val == sum && (root.left == null && root.right == null))
    		return true;
    	boolean f1=hasPathSum(root.left,sum-root.val); 
        boolean f2=hasPathSum(root.right,sum-root.val);
        return f1||f2;
       }
    
    /*public List<Integer> rightSideView(TreeNode root)
    {
    	List<Integer> l=new ArrayList<Integer>();
    	Queue<TreeNode> queue=new ArrayDeque<TreeNode>();
    	if(root==null)
    		return null;
    	queue.add(root);
    	l.add(root.val);
    	while(!queue.isEmpty())
    	{

    	}
    }*/
    
    public List<List<Integer>> levelOrder(TreeNode root)
    {
    	List<List<Integer>> resultlist=new ArrayList<List<Integer>>();
    	List<Integer> levellist=new ArrayList<Integer>();
    	Queue<TreeNode> queue=new ArrayDeque<TreeNode>();
    	if(root==null)
    		return null;
    	else
    		return null;
    	/*queue.add(root);
    	levellist.add(root.val);
    	resultlist.add(levellist);
    	//System.out.println(root.val);
    	while(!queue.isEmpty())
    	{
    		TreeNode head=queue.poll();
    		//System.out.println(head.val);
    		if(head.left!=null)
    			queue.add(head.left);
    		if(head.right!=null)
    			queue.add(head.right);
    	}*/
    }
    
    
    /*public void levelOrder(TreeNode root)
    {
    	//List<List<Integer>> resultlist=new ArrayList<List<Integer>>();
    	//List<Integer> levellistnew=new ArrayList<Integer>();
    	Queue<TreeNode> queue=new ArrayDeque<TreeNode>();
    	if(root==null)
    		return;
    	queue.add(root);
    	//System.out.println(root.val);
    	while(!queue.isEmpty())
    	{
    		TreeNode head=queue.poll();
    		System.out.println(head.val);
    		if(head.left!=null)
    			queue.add(head.left);
    		if(head.right!=null)
    			queue.add(head.right);
    	}
    }*/
    
    public int singleNumber(int[] nums) 
    {
    	int len=nums.length;
    	Hashtable<Integer,Integer> hash=new Hashtable<Integer,Integer>(len);
    	int k=1;
    	int j=1;
    	for(int i=0;i<len;i++)
    	{
    		if(hash.containsKey(nums[i]))
    			hash.put(nums[i], k++);
    		else
    			hash.put(nums[i], j);
    	}
    	for(Map.Entry<Integer, Integer> m:hash.entrySet())
    	{
    		if(m.getValue()==1)
    			return m.getKey();
    	}
    	return 0;
    }
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid)
    {
        int row=obstacleGrid.length;
        int col=obstacleGrid[0].length;
        int [][] dp=new int[row][col];
        for(int i=0;i<row;i++)
    		dp[i][0]=1;
    	for(int i=0;i<col;i++)
    		dp[0][i]=1;
    	for(int i=1;i<row;i++)
    		for(int j=1;j<col;j++)
    		{
    			if(obstacleGrid[i][j]==1)
    				dp[i][j]=0;
    			else
    				dp[i][j]=dp[i-1][j]+dp[i][j-1];    			
    		}
        
    	return dp[row-1][col-1];
    }
    
    public int uniquePaths(int m, int n)
    {
    	int[][] dp=new int[m][n];
    	for(int i=0;i<m;i++)
    		dp[i][0]=1;
    	for(int i=0;i<n;i++)
    		dp[0][i]=1;
    	for(int i=1;i<m;i++)
    		for(int j=1;j<n;j++)
    		{
    			dp[i][j]=dp[i-1][j]+dp[i][j-1];
    		}
    	return dp[m-1][n-1];
    }
    
    public int minPathSum(int[][] grid)
    {
    	//HashMap<String,Integer> map=new HashMap<String,Integer>();
    	int row=grid.length;
    	int col=grid[0].length;
    	int[][] dp=new int[row][col];
    	dp[0][0]=grid[0][0];
    	for(int i=1;i<row;i++)
    		dp[i][0]=dp[i-1][0]+grid[i][0];
    	for(int j=1;j<col;j++)
    		dp[0][j]=dp[0][j-1]+grid[0][j];
    	for(int i=1;i<row;i++)
    		for(int j=1;j<col;j++)
    		{
    			int val=grid[i][j];
    			dp[i][j]=maxFun(dp[i-1][j]+val,dp[i][j-1]+val);
    		}
    	return dp[row-1][col-1];
    }
    
    int TreeHeight(TreeNode root)
    {
    	if(root==null)
    		return 0;
    	int lh=TreeHeight(root.left);
    	int rh=TreeHeight(root.right);
    	if(lh>rh)
    		return lh+1;
    	else
    		return rh+1;
    }
    
    /*leetcode 3sum problem 
     * public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        
        List<List<Integer>> returnList=new ArrayList<List<Integer>>();
        int i=0;
        int j=len-1;
        int t,q;
        while(i<j)
        {
        	if(nums[i]+nums[j]<=0)
        	{
        		for(t=j-1;t>=0;t--)
        		{
        			if(nums[t]+nums[i]+nums[j]==0)
        			{
        				List<Integer> element =new ArrayList<Integer>();
        				element.add(nums[i]);
        				element.add(nums[t]);
        				element.add(nums[j]);
        				if(!returnList.contains(element))
        					returnList.add(element);
        				break;
        			}
        			else
        			{
        				if(nums[t]<0)
        					break;
        				continue;
        			}
        		}
        	}
        	else
        	{
        		for(q=i+1;q<j;q++)
        		{
        			if(nums[q]+nums[i]+nums[j]==0)
        			{
        				List<Integer> element =new ArrayList<Integer>();
        				element.add(nums[i]);
        				element.add(nums[q]);
        				element.add(nums[j]);
        				if(!returnList.contains(element))
        					returnList.add(element);
        				break;
        			}
        			else
        			{
        				if(nums[q]>=0)
        					break;
        				continue;
        			}
        		}
        	}
        }
    }*/
    
    public void setZeroes(int[][] matrix) {
    	int rows=matrix.length;
    	int cols=matrix[0].length;
    	int i,j;
    	int m,n;
    	for(i=0;i<rows;i++)
    		for(j=0;j<cols;j++)
    		{
    			if(matrix[i][j]!=0)
    				continue;
    			else
    			{
    				for(m=0;m<i;m++)
    					matrix[m][j]=0;
    				for(n=0;n<j;n++)
    					matrix[i][n]=0;
    				break;
    			}
    		}
    }
    
    public int maxArea(int[] height) {
    	
    	int length=height.length;
    	HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
    	for(int i=1;i<=length;i++)
    		map.put(i, height[i-1]);
    	return 0;//no means,only for return int 
    }
    
    public boolean containsDuplicate(int[] nums){
    	HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
    	int length=nums.length;
    	int times=1;
    	for(int i=0;i<length;i++)
    	{
    		if(map.containsKey(nums[i]))
    			return false;
    		else
    			map.put(nums[i],times);
    	}
    	return true;
    }
    
    public boolean wordPattern(String pattern, String str){
    	HashMap<String, String> map=new HashMap<String,String>();
    	String[] strarray=str.split(" ");
    	int length=pattern.length();
    	if(strarray.length!=length)
    		return false;
    	for(int i=0;i<length;i++)
    	{
       		String key=String.valueOf(pattern.charAt(i));
    		if(map.containsKey(key))
    		{
    			if(!map.get(key).equals(strarray[i]))
    				return false;
    		}
    		else
    		{
    			if(map.values().contains(strarray[i]))
    				return false;
    			map.put(key, strarray[i]);
    		}
    	}
    	return true;
    }
    
    public int lengthOfLongestSubstring(String s){
    	int length=s.length();
    	int[] index=new int[256];
    	int position=-1,max=0;
    	for(int i=0;i<length;i++)
    	{
    		if(index[s.charAt(i)]>position)
    			position=index[s.charAt(i)];
    		if(i-position>max)
    			max=i-position;
    		index[s.charAt(i)]=i;
    	}
    	return max;
    }
    
    /*public String sortStr(String s){
    	char[] chararray=s.toCharArray();
    	Arrays.sort(chararray);
    	return new String(chararray);
    }
    
    public void SearchandAdd(String[] strs,List<String> list)
    {
    	int length=strs.length;
    	for(int i=0;i<length;i++)
    	{
    		if(sortStr(list.get(0))==sortStr(strs[i]))
    		{
    			list.add(strs[i]);
    		}
    	}
    }
    
    public List<List<String>> groupAnagrams(String[] strs){
    	int length=strs.length;
    	//HashMap<String, Integer> map=new HashMap<String,Integer>();
    	List<List<String>> outerList =new ArrayList<List<String>>();
    	Set<String> set=new HashSet<String>();
    	for(int i=0;i<length;i++)
    	{
    		if(!set.contains(sortStr(strs[i])))
    		{
    			set.add(strs[i]);
    		}
    	}
    	int size=set.size();
    	for(Iterator<String> iter=set.iterator();iter.hasNext();)
    	{
    		List<String> innerList = new ArrayList<String>();
    		innerList.add(iter.next());
    		SerachandAdd(strs,innerList);
    		outerList.add(innerList);
    	}
    }*/
    
    public int compareVersion(String version1, String version2)
    {
    	if(version1 == null || version2 ==null) return 0; 
    	String[] v1=version1.split("\\.");
    	String[] v2=version2.split("\\.");
    	int len1=v1.length;
    	int len2=v2.length;
    	int i=0;
    	while(i<len1||i<len2)
    	{
    		int value1=i<len1?Integer.parseInt(v1[i]):0;
    		int value2=i<len2?Integer.parseInt(v2[i]):0;
    		if(value1>value2)
    			return 1;
    		else if(value1<value2)
    			return -1;
    		else
    			i++;
    	}
    	return 0;
    	/*int len,i;
    	if(len1==0 && len2==0)
    	{
    		if(version1.compareTo(version2)>0)
    			return 1;
    		else if(version1.compareTo(version2)==0)
    			return 0;
    		else
    			return -1;
    	}
    	else if(len1==0)
    	{
    		if(version1.compareTo(v2[0])>0)
    			return 1;
    		else if(version1.compareTo(v2[0])==0)
    			return 0;
    		else
    			return -1;
    	}
    	else if(len2==0)
    	{
    		if(v1[0].compareTo(version2)>0)
    			return 1;
    		else if(v1[0].compareTo(version2)==0)
    			return 0;
    		else
    			return -1;
    	}
    	else
    	{
    		len=len1<=len2?len1:len2;
        	for(i=0;i<len;i++)
        	{
        		if(v1[i].compareTo(v2[i])>0)
        		{
        			return 1;
        		}
        		else if(v1[i].compareTo(v2[i])<0)
        		{
        			return -1;
        		}
        		else
        			continue;
        	} 
        	if(i==len1 && i==len2)
        		return 0;
        	else if(i==len1)
        		return -1;
        	else
        		return 1;
    	}*/    	
    }
        
    
    // the code is so rubbish
    //F********K
    public String numberToWords(int num)
    {
    	
    	Hashtable<Integer, String> map=new Hashtable<Integer,String>();
    	int i,j;
    	String[] array={"zero","One","Two","Three","Four","Five","Six","Seven","Eight",
    			"Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen",
    			"Sixteen","Seventeen","Eighteen","Nineteen","Twenty","Thirty",
    			"Forty","Fifty","Sixty","Seventy","Eighty","Ninety","Hundred",
    			"Thousand","Million","Billion"};
    	for(i=0;i<=19;i++)
    		map.put(i, array[i]);
    	for(i=20,j=20;i<=100;i=i+10,j++)
    	{
    		map.put(i, array[j]);
    	}
    	map.put(1000, array[j++]);
    	map.put(1000000, array[j++]);
    	map.put(1000000000, array[j]);
    	int[] value={100,1000,1000000,1000000000};
    	int len=value.length;
    	int quotient=num;
    	int remainder=0;
    	StringBuffer sb=new StringBuffer();
    	for(i=len-1;i>=0;i--)
    	{
    		remainder=quotient%value[i];
    		quotient=quotient/value[i];
       		if(quotient==0)
    		{
    			quotient=remainder;
    			continue;
    		}
       		if(map.get(quotient)==null)
       		{
       			int x1=quotient/100;
       			int x2=quotient%100;
       			if(x1==0)
       			{
       				int y1=quotient/10;
       	    		int y2=quotient%10;
       	    		sb.append(map.get(y1*10));
       	    		sb.append(" ");
       	    		sb.append(map.get(y1));
       	    		sb.append(" ");
       			}
       			else
       			{
       				sb.append(map.get(x1));
       	    		sb.append(" ");
       	    		sb.append(map.get(100));
       	    		sb.append(" ");
       	    		if(x2<10)
       	    		  sb.append(map.get(x2));
       	    		else
       	    		{
       	    			int z1=x2/10;
       	     		    int z2=x2%10;
       	     		    sb.append(map.get(z1*10));
       	     		    sb.append(" ");
       	     		    sb.append(map.get(z2));
       	     		    sb.append(" ");
       	    		}
       			}
       		}
       		else
       		{
       			sb.append(map.get(quotient));
        		sb.append(" ");
       		}
    		sb.append(map.get(value[i]));
    		sb.append(" ");
    		quotient=remainder;
    	}
    	if(remainder<=20 && remainder>0)
    		sb.append(map.get(remainder));
    	else
    	{
    		int v1=remainder/10;
    		int v2=remainder%10;
    		if(v2==0)
    		{
    		    sb.append(map.get(v1*10));
    		}
    		else
    		{
    		    sb.append(map.get(v1*10));
    		    sb.append(" ");
    		    sb.append(map.get(v2));
    		}
    	}
    	return sb.toString();
    }
   
	//public List<Integer> getRow(int rowIndex) {}
	public static void main(String[] args) {
		Solution sl=new Solution();
		/*String pattern="abba";
		String str="cat dog dog cat";
		sl.wordPattern(pattern, str);*/
		//System.out.println(sl.compareVersion("2.5.0", "2.5"));
		System.out.println(sl.numberToWords(100));
		//List<String> resultlist=new ArrayList<String>();
		//resultlist=sl.binaryTreePaths(root)
		//int[] array={0,13,65,5,97,25,0,37,22,0,4,28,0,0,32,0};
		/*int[] array={0,5,4,8,11,0,13,4};
		TreeNode t=sl.makeBinaryTreeByArray(array, 1);
		int h=sl.TreeHeight(t);
		System.out.println(h);*/
		//resultlist=sl.binaryTreePaths(t);
		//for(int i=0;i<resultlist.size();i++)
			//System.out.println(resultlist.get(i));
		//sl.TraversePreOrder(t);
		//int h=sl.Heigth(t);
		//System.out.println(h);
		//sl.inOrder(t);
		//boolean flag=sl.isSymmetric(t);
		//System.out.println(flag);
		/*sl.levelOrder(t);
		int[] newarray={2,2,1};
		int x=sl.singleNumber(newarray);
		System.out.println(x);
		boolean pathFlag=sl.hasPathSum(t, 22);
		System.out.println(pathFlag);*/
		//for(int i=0;i<mylist.size();i++)
			//System.out.print(mylist.get(i));
		//boolean flag=sl.isBalanced(t);
		//System.out.print(flag);
		/*int a[][]={{1,2},{1,1}};
		int ways=sl.minPathSum(a);
		System.out.println(ways);
		Integer i=new Integer(10);
		Integer j=new Integer(10);
		System.out.println(i==j);
		System.out.println(i.equals(j));*/
		
		
	}
}
