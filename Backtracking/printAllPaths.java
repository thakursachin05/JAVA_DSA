
public class printAllPaths {
	public static void RatInMaze(int [][]maze) {
		int n = maze.length;
		int [][]visited = new int[n][n];
		pathPossible(maze,0,0,visited);
	}
	
	public static void pathPossible(int [][]maze, int i, int j,int [][] visited) {
		int n = maze.length;
		if(i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || visited[i][j]==1) {
			return;
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
			System.out.println();
			visited[i][j]=0;
			return;
		}
		pathPossible(maze,i-1,j,visited);
		pathPossible(maze,i,j+1,visited);
		pathPossible(maze,i+1,j,visited);
		pathPossible(maze,i,j-1,visited);
		visited[i][j]=0;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] maze = {{1,1,1},{1,1,0},{1,1,1}};
		RatInMaze(maze);
	}

}
