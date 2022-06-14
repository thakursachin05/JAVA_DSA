
public class ratInMaze {

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
			return true;
		}
		if(pathPossible(maze,i-1,j,visited)) return true;
		if(pathPossible(maze,i+1,j,visited)) return true;
		if(pathPossible(maze,i,j-1,visited)) return true;
		if(pathPossible(maze,i,j+1,visited)) return true;
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] maze = {{1,0,1},{0,1,0},{1,1,1}};
		System.out.print(RatInMaze(maze));
	}

}
