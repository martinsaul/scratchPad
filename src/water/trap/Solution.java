package water.trap;

import java.util.LinkedList;

public class Solution {
	public static void main(String[] args){
		int[] map = {0,1,0,2,1,0,1,3,2,1,2,1};

		int rsp = new Solution().process(map);
		System.out.println(rsp);
	}

	private int process(int[] map){
		int total = 0;

		LinkedList<Coordinate> stack = new LinkedList<>();

		for (int index = 0; index < map.length; index++) {
			int height = map[index];

			while(!stack.isEmpty() && height > stack.peek().height){
				int depth = stack.pop().height;
				if(stack.isEmpty())
					break;
				Coordinate leftCorner = stack.pop();
				total += (index - leftCorner.coordinate - 1) * (Math.min(height, leftCorner.height) - depth);
			}
			if(!stack.isEmpty() && stack.peek().height == height)
				stack.pop();

			stack.push(new Coordinate(index, height));
		}

		return total;
	}

	private class Coordinate {
		private final int coordinate,height;

		private Coordinate(int coordinate, int height) {
			this.coordinate = coordinate;
			this.height = height;
		}
	}
}
