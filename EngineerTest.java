package RaceEngineer;

public class EngineerTest{
	
	public static void main(String[] args) {
		EngineerControl control = new EngineerControl();
		Engine engine = new Engine();
		EngineOnCommand engineOn = new EngineOnCommand(engine);
		
		
		control.setCommand(engineOn);
		control.commandInitiated();
	}

}
