package RaceEngineer;

public class EngineOnCommand implements Command {
	Engine engine;
	
	public EngineOnCommand(Engine engine) {
		this.engine = engine;
	}
	
	public void on() {
		engine.on();	
	}	
}
