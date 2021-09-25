package tech.fastj.modeleditor;

import tech.fastj.engine.FastJEngine;
import tech.fastj.graphics.display.Display;
import tech.fastj.graphics.display.RenderSettings;

import tech.fastj.systems.control.SimpleManager;

public class Main extends SimpleManager {

    @Override
    public void init(Display display) {
        display.modifyRenderSettings(RenderSettings.Antialiasing.Enable);
    }

    @Override
    public void update(Display display) {
    }

    public static void main(String[] args) {
        FastJEngine.init("FastJ Model Editor", new Main());
        FastJEngine.run();
    }
}
