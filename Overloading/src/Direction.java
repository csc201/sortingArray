public enum Direction {
		NORTH(0,5), EAST(5,0), WEST(-5,0), SOUTH(0,-5);
		private int x=0, y=0;
		Direction(int arg1,int arg2) {this.x=arg1; this.y=arg2;};
		public int getX() {return x;};
		public int getY() {return y;};
}