import abstractFactory.app.Application;
import abstractFactory.buttons.Button;
import abstractFactory.checkboxes.Checkbox;
import abstractFactory.factories.GUIFactory;
import abstractFactory.factories.MacOSFactory;
import abstractFactory.factories.WindowsFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbstractFactoryTest {
    private Application configureApplication(String factoryType) {
        GUIFactory factory;
        if (factoryType.equals("OSX")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        return new Application(factory);
    }

    @Test
    public void testOSXFactory() {
        Application app = configureApplication("OSX");
        Button button = app.getButton();
        Checkbox checkbox = app.getCheckbox();

        assertEquals("MacOSButton", button.getClass().getSimpleName());
        assertEquals("MacOSCheckbox", checkbox.getClass().getSimpleName());
    }

    @Test
    public void testWindowsFactory() {
        Application app = configureApplication("Windows");
        Button button = app.getButton();
        Checkbox checkbox = app.getCheckbox();

        assertEquals("WindowsButton", button.getClass().getSimpleName());
        assertEquals("WindowsCheckbox", checkbox.getClass().getSimpleName());
    }
}