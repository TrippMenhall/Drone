public class App extends wheels.users.Frame{
	
	protected Drone drone1;
	
	public App() {
		drone1 = new Drone(java.awt.Color.red, 300, 200);
		new Swatch(0, 400, java.awt.Color.black, 'w');
		new Swatch(150, 400, java.awt.Color.yellow, 'w');
		new Swatch(300, 400, java.awt.Color.green, 'w');
		new Swatch(450, 400, java.awt.Color.blue, 'w');
		new Swatch(600, 400, java.awt.Color.red, 'w');
		new Swatch(0, 450, java.awt.Color.black, 'b');
		new Swatch(150, 450, java.awt.Color.yellow, 'b');
		new Swatch(300, 450, java.awt.Color.green, 'b');
		new Swatch(450, 450, java.awt.Color.blue, 'b');
		new Swatch(600, 450, java.awt.Color.red, 'b');
	}

	public static void main(String[] args) {
		new App();
	}
}