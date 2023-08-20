package adityaTeaches.heap;
import java.util.*;
public class K_closestToOrigin {

	public static void main(String[] args) {
        int[][] points = { { 1, 3 }, { -2, 2 }, { 5, 8 }, { 0, 1 } };
        int k = 2;

        K_closestToOrigin solution = new K_closestToOrigin();
        int[][] closestPoints = solution.kClosest(points, k);

        System.out.println("The " + k + " closest points to the origin are:");
        for (int[] point : closestPoints) {
            System.out.println("(" + point[0] + ", " + point[1] + ")");
        }
    }
	
	public int [][] kClosest(int [][] points , int k){
		PriorityQueue<Pair1> maxHeap= new PriorityQueue<Pair1>(new Com());
		int row=points.length;
		for(int i=0;i<row;i++) {
			int a=points[i][0];
			int b=points[i][1];
			maxHeap.add(new Pair1(((a*a)+(b*b)),new Tuple(a,b)));
			if(maxHeap.size()>k) {
				maxHeap.poll();
			}
		}
		int [][] ans=new int [k][2];
		int r=0;
		while(maxHeap.size()>0) {
			Pair1 p=maxHeap.poll();
			Tuple tu=p.t;
			int ro=tu.x;
			int c=tu.y;
			ans[r][0]=ro;
			ans[r][1]=c;
			r++;
		}
		return ans;
	}

}
class Pair1{
	int dist;
	Tuple t;
	Pair1(int d,Tuple t1){
		dist=d;
		t=t1;
	}
}
class Tuple{
	int x;
	int y;
	Tuple(int xc, int yc){
		x=xc;
		y=yc;
	}
}
class Com implements Comparator<Pair1>{
	public int compare(Pair1 p1, Pair1 p2) {
		if(p1.dist<p2.dist) {
			return -1;
		}
		else if(p1.dist>p2.dist) {
			return -1;
		}
		else return 0;
	}
}
