
public class PrintpathsRatinMaze {
	public static boolean RatInMaze(int [][]maze) {
		int n = maze.length;
		int [][]visited = new int[n][n];
		return pathPossible(maze,0,0,visited);
	}
	
	public static boolean pathPossible(int [][]maze, int i, int j,int [][] visited) {
		int n = maze.length;
		if(i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || visited[i][j]==1) {
			return false;
		}
		
		visited[i][j]=1;
		//top
		if(i==n-1 && j==n-1) {
			for(int r=0;r<n;r++) {
				for(int c=0;c<n;c++) {
					System.out.print(visited[r][c]+" ");
				}
				System.out.println();
			}
			return true;
		}
		if(pathPossible(maze,i-1,j,visited)) {
//			System.out.print(i + " " + j+"->");
			return true;
		}
		if(pathPossible(maze,i,j+1,visited)) {
//			System.out.print(i + " " + j+"->");
			return true;
		}
		if(pathPossible(maze,i+1,j,visited)) {
//			System.out.print(i + " " + j+"->");
			return true;
		}
		if(pathPossible(maze,i,j-1,visited)) {
//			System.out.print(i + " " + j+"->");
			return true;
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] maze = {{1,1,0},{1,1,0},{1,1,1}};
		boolean IsPossible = RatInMaze(maze);
		System.out.println(IsPossible);
	}

}
